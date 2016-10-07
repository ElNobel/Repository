

public class FSM {
    private State state = State.UNKNOWN;//Состояние автомата по умолчанию

    public State getState() {
        return state;
    }

    public void handlingData(InData inData) {
        int numberOfZero = 0;
        int numberOfOne = 0;

        if (inData.getText().equals("End")) {
            System.exit(0);
        }

        if (inData.getText() == null || "".equals(inData.getText())) {
            state = State.INCORRECT_DATA;
            return;
        }

        for (char aChar : inData.getText().toCharArray()) {
            if (aChar == '0') {
                numberOfZero++;
            } else if (aChar == '1') {
                numberOfOne++;
            } else {
                state = State.INCORRECT_DATA;
                return;
            }
        }

        if (numberOfZero % 2 == 0 && numberOfOne % 2 != 0){
            state = State.YES;
            return;
        }
        else{
            state = State.NO;
            return;
        }
    }

    public void reset() {
        state = State.UNKNOWN;
    }


}
