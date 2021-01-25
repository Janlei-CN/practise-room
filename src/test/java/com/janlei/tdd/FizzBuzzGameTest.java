package com.janlei.tdd;

import com.janlei.tdd.handler.BuzzHandler;
import com.janlei.tdd.handler.FizzHandler;
import com.janlei.tdd.handler.IGameHandler;
import com.janlei.tdd.model.FizzBuzzGame;
import org.junit.jupiter.api.Test;

import static com.janlei.tdd.constant.StringConstant.BUZZ;
import static com.janlei.tdd.constant.StringConstant.FIZZ;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGameTest {

    @Test
    void test_should_return_Fizz_case_given_input_can_be_divided_by_3() {
        FizzBuzzGame game = prepareInstance();

        assertEquals(FIZZ, game.result(3));
    }

    @Test
    void test_should_return_input_case_given_input_can_not_be_divided_by_3() {
        FizzBuzzGame game = prepareInstance();

        assertEquals("4", game.result(4));
    }

    @Test
    void test_should_return_Buzz_case_given_input_can_not_be_divided_by_5() {
        FizzBuzzGame game = prepareInstance();

        assertEquals(BUZZ, game.result(5));
    }

    @Test
    void test_should_return_FizzBuzz_case_given_input_can_not_be_divided_by_3_and_5() {
        FizzBuzzGame game = prepareInstance();

        assertEquals("FizzBuzz", game.result(3 * 5));
    }


    private FizzBuzzGame prepareInstance() {
        FizzBuzzGame game = new FizzBuzzGame();

        IGameHandler fizzHandler = new FizzHandler();
        game.setRule(fizzHandler);
        IGameHandler buzzHandler = new BuzzHandler();
        game.setRule(buzzHandler);
        return game;
    }
}
