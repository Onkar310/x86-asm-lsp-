from prompt_toolkit import PromptSession
from prompt_toolkit.completion import Completer, Completion

# Define extensive lists of valid assembly instructions
valid_instructions = [
    "mov",
    "add",
    "sub",
    "jmp",
    "inc",
    "dec",
    "cmp",
    "push",
    "pop",
    "aaa",
    "aad",
    "aam",
    "aas",
    "adc",
    "and",
    "call",
    "cbw",
    "clc",
    "cld",
    "cli",
    "cmc",
    "cmpsb",
    "cmpsw",
    "cwd",
    "daa",
    "das",
    "div",
    "esc",
    "hlt",
    "idiv",
    "imul",
    "in",
    "int",
    "into",
    "iret",
    "ja",
    "jae",
    "jb",
    "jbe",
    "jc",
    "je",
    "jg",
    "jge",
    "jl",
    "jle",
    "jna",
    "jnae",
    "jnb",
    "jnbe",
    "jnc",
    "jne",
    "jng",
    "jnge",
    "jnl",
    "jnle",
    "jno",
    "jnp",
    "jns",
    "jnz",
    "jo",
    "jp",
    "jpe",
    "jpo",
    "js",
    "jz",
    "jcxz",
    "jmp",
    "jmps",
    "jmpf",
    "lahf",
    "lds",
    "lea",
    "les",
    "lock",
    "lods",
    "lodsb",
    "lodsw",
    "loop",
    "loope",
    "loopne",
    "loopnz",
    "loopz",
    "mov",
    "movs",
    "movsb",
    "movsw",
    "mul",
    "neg",
    "nop",
    "not",
    "or",
    "out",
    "pop",
    "popf",
    "push",
    "pushf",
    "rcl",
    "rcr",
    "ret",
    "retn",
    "retf",
    "rol",
    "ror",
    "sahf",
    "sal",
    "sar",
    "salc",
    "sbb",
    "scasb",
    "scasw",
    "shl",
    "shr",
    "stc",
    "std",
    "sti",
    "stosb",
    "stosw",
    "sub",
    "test",
    "wait",
    "xchg",
    "xlat",
    "xor",
    "your_instruction_1",
    "your_instruction_2",
    "your_instruction_3",  # Add your custom instructions
]

# Define extensive list of valid directives
valid_directives = [
    "org",
    "end",
    "if",
    "endif",
    "equ",
    "db",
    "dw",
    "cseg",
    "dd",
    "dseg",
    "title",
    "include",
    "rw",
    "rb",
    "rs",
    "dot",
    "your_directive_1",
    "your_directive_2",  # Add your custom directives
]

# Create a list of valid conditions
valid_conditions = [
    "eq",
    "ne",
    "lt",
    "le",
    "gt",
    "ge",
    "your_condition_1",
    "your_condition_2",  # Add custom conditions
]
valid_numbers = [
    "0",
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7",
    "8",
    "9",  # Add custom conditions
]
# Create a list of valid registers
valid_registers = [
    "ax",
    "bx",
    "cx",
    "dx",
    "si",
    "di",
    "sp",
    "bp",
    "ah",
    "bh",
    "ch",
    "dh",
    "al",
    "bl",
    "cl",
    "dl",
    "cs",
    "ds",
    "es",
    "ss",
    "fs",
    "gs",  # Add more registers
]

# Create a list of valid labels
valid_labels = [
    "start",
    "loop",
    "end",
    "your_label_1",
    "your_label_2",  # Add custom labels
]

# Create a list of valid numbers


# Create context-based suggestions for each instruction
context_suggestions = {
    "mov": ["REGISTER", "NUMBER", "LABEL"],
    "add": ["REGISTER", "NUMBER"],
    "sub": ["REGISTER", "NUMBER"],
    "jmp": ["LABEL"],
    "inc": ["REGISTER"],
    "dec": ["REGISTER"],
    "org": ["NUMBER"],
    "if": ["CONDITION"],
    "your_instruction_1": ["your_context_1", "your_context_2"],  # Add custom contexts
    "your_instruction_2": ["your_context_3", "your_context_4"],  # Add custom contexts
    "your_directive_1": ["your_context_5", "your_context_6"],  # Add custom contexts
    "your_directive_2": ["your_context_7", "your_context_8"],  # Add custom contexts
}


# Create a custom Completer for context-based suggestions
class ContextCompleter(Completer):
    def get_completions(self, document, complete_event):
        current_text = document.text_before_cursor
        parts = current_text.split()
        if parts:
            last_part = parts[-1]
            if last_part in context_suggestions:
                suggestions = context_suggestions[last_part]
                if "REGISTER" in suggestions:
                    suggestions.remove("REGISTER")
                    suggestions.extend(valid_registers)
                if "NUMBER" in suggestions:
                    suggestions.remove("NUMBER")
                    suggestions.extend(valid_numbers)
                if "CONDITION" in suggestions:
                    suggestions.remove("CONDITION")
                    suggestions.extend(valid_conditions)
                if "LABEL" in suggestions:
                    suggestions.remove("LABEL")
                    suggestions.extend(valid_labels)
                for suggestion in suggestions:
                    yield Completion(suggestion, start_position=-len(last_part))


# Initialize the session with the custom Completer
session = PromptSession(completer=ContextCompleter())


def main():
    try:
        last_instruction = None
        while True:
            user_input = session.prompt("Enter assembly code: ")

            if user_input:
                parts = user_input.split()
                if parts:
                    last_part = parts[-1]

                    if last_part in context_suggestions:
                        # Suggest context-based next tokens
                        suggested_tokens = context_suggestions.get(last_part, [])
                        if suggested_tokens:
                            print("Suggested Code: " + ", ".join(suggested_tokens))
                    else:
                        # Suggest valid directives or instructions
                        if last_part == "":
                            print(f"Suggested Instructions: {valid_instructions}")
                        elif last_part in valid_instructions:
                            print(f"Suggested Directives: {valid_directives}")
                        elif last_part == "if":
                            print(f"Suggested Conditions: {valid_conditions}")
                        else:
                            print("Invalid input")

    except KeyboardInterrupt:
        print("Goodbye!")


if __name__ == "__main__":
    main()
