from prompt_toolkit import PromptSession
from prompt_toolkit.completion import Completer, Completion
import re

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
]

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
]


valid_conditions = [
    "eq",
    "ne",
    "lt",
    "le",
    "gt",
    "ge",
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
    "9",
]

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
    "gs",
]


valid_labels = [
    "start",
    "loop",
    "end",
]

context_suggestions = {
    "mov": ["REGISTER", "NUMBER"],
    "add": ["REGISTER", "NUMBER"],
    "sub": ["REGISTER", "NUMBER"],
    "jmp": ["LABEL"],
    "inc": ["REGISTER"],
    "dec": ["REGISTER"],
    "org": ["NUMBER"],
    "if": ["CONDITION"],
    "ax": ["REGISTER"],
    "bx": ["REGISTER"],
    "cx": ["REGISTER"],
    "dx": ["REGISTER"],
    "si": ["REGISTER"],
    "di": ["REGISTER"],
    "sp": ["REGISTER"],
    "bp": ["REGISTER"],
    "ah": ["REGISTER"],
    "bh": ["REGISTER"],
    "ch": ["REGISTER"],
    "dh": ["REGISTER"],
    "al": ["REGISTER"],
    "bl": ["REGISTER"],
    "cl": ["REGISTER"],
    "dl": ["REGISTER"],
    "cs": ["REGISTER"],
    "ds": ["REGISTER"],
    "es": ["REGISTER"],
    "ss": ["REGISTER"],
    "fs": ["REGISTER"],
    "gs": ["REGISTER"],
}


class ContextCompleter(Completer):
    def __init__(self):
        self.user_input = ""

    def get_completions(self, document, complete_event):
        current_text = document.text_before_cursor
        full_text = self.user_input + current_text
        parts = full_text.split()
        if parts:
            last_part = parts[-1]

            if last_part in context_suggestions:
                suggestions = context_suggestions[last_part]

                if "REGISTER" in suggestions:
                    # If not a valid register prefix, display all registers
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
                    yield Completion(suggestion, start_position=0)
            else:
                pattern = r"^[+-]?\d+$"
                valid_instr_suggestions = [
                    instr for instr in valid_instructions if instr.startswith(last_part)
                ]
                if bool(re.match(pattern, last_part)):
                    valid_instr_suggestions = [instr for instr in valid_numbers]
                if valid_instr_suggestions:
                    for suggestion in valid_instr_suggestions:
                        yield Completion(suggestion, start_position=0)
                else:
                    for instr in valid_instructions:
                        yield Completion(instr)


session = PromptSession(completer=ContextCompleter())


def main():
    try:
        print("Enter code  :")
        input = session.prompt()
        while True:
            user_input = session.prompt()
            input += user_input

    except KeyboardInterrupt:
        print("Goodbye!")
    finally:
        print(input)


if __name__ == "__main__":
    main()
