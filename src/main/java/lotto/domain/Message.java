package lotto.domain;

public enum Message {

    ERROR_NON_NUMBER("숫자만 입력해주세요."),
    ERROR_NON_POSITIVE_NUMBER("0을 초과하는 숫자를 입력해주세요."),
    ERROR_EMPTY_INPUT("빈 값이 입력되었습니다. 다시 입력해주세요."),

    ERROR_AMOUNT_OUT_OF_RANGE("%d원 이상, %d원 이하의 금액을 입력해주세요."),
    ERROR_AMOUNT_CANNOT_BE_DIVIDED("로또 가격(%d원)으로 정확히 나누어떨어지는 금액을 입력해주세요."),
    ERROR_LOTTO_NUMBER_DUPLICATED("중복된 숫자가 있습니다. 중복없이 %d개의 숫자를 입력해주세요."),
    ERROR_LOTTO_NUMBER_WRONG_COUNT("%d개의 숫자를 입력해주세요."),
    ERROR_LOTTO_NUMBER_OUT_OF_RANGE("%d와 %d사이의 숫자를 입력해주세요."),


    REQUEST_INPUT_AMOUNT("구입금액을 입력해주세요."),
    REQUEST_INPUT_WINNING_NUMBERS("구분자(쉼표(,) 혹은 콜론(:))를 이용하여 지난 주 당첨 번호를 입력해 주세요."),
    INFO_TOTAL_COUNT("%d개를 구매했습니다."),
    INFO_BEFORE_PRINT_LOTTO_RESULT("당첨 통계\n--------");

    private String text;

    Message(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
