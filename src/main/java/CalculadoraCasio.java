public class CalculadoraCasio {

    private int ans;

    public CalculadoraCasio() {
        ans = 0;
    }

    public int sum(int variableX, int variableY) {
        return ans = variableX + variableY;
    }

    public int substract(int variableX, int variableY) {
        return ans = variableX - variableY;
    }

    public int sum(int variableX) {
        return ans += variableX;
    }

    public int substract(int variableY) {
        return ans -= variableY;
    }

    public int div(int variableX, int variableY) {
        if (variableY == 0) {
            throw new ArithmeticException("no se puede divir entre cero!");
        }
        return ans = variableX / variableY;
    }

    public void operacionMuyOptima() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Se interrupio");
            e.printStackTrace(System.out);
        }
    }

    public int getAns() {
        return ans;
    }

    public void clear() {
        ans = 0;
    }

}
