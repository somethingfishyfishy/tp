package seedu.address.logic.parser;

import org.junit.jupiter.api.Test;
import seedu.address.logic.commands.*;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;

public class HelpCommandParserTest {
    private HelpCommandParser parser = new HelpCommandParser();

    @Test
    public void parse_success() {
        HelpCommand expected = new HelpCommand();
        String userInput = "";
        assertParseSuccess(parser, userInput, expected);

        expected = new HelpCommand(HelpCommand.HELP_ADD);
        userInput = AddCommand.COMMAND_WORD;
        assertParseSuccess(parser, userInput, expected);

        expected = new HelpCommand(HelpCommand.HELP_EDIT);
        userInput = EditCommand.COMMAND_WORD;
        assertParseSuccess(parser, userInput, expected);

        expected = new HelpCommand(HelpCommand.HELP_DELETE);
        userInput = DeleteCommand.COMMAND_WORD;
        assertParseSuccess(parser, userInput, expected);

        expected = new HelpCommand(HelpCommand.HELP_CLEAR);
        userInput = ClearCommand.COMMAND_WORD;
        assertParseSuccess(parser, userInput, expected);

        expected = new HelpCommand(HelpCommand.HELP_FIND);
        userInput = FindCommand.COMMAND_WORD;
        assertParseSuccess(parser, userInput, expected);

        expected = new HelpCommand(HelpCommand.HELP_LIST);
        userInput = ListCommand.COMMAND_WORD;
        assertParseSuccess(parser, userInput, expected);
    }
    
    @Test
    public void parse_failure() {
        String userInput = "random";
        assertParseFailure(parser, userInput, String.format(MESSAGE_INVALID_COMMAND_FORMAT, HelpCommand.MESSAGE_USAGE));
    }
}
