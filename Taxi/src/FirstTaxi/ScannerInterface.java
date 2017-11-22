package FirstTaxi;

/**
 * Created by ${USER} on ${DATE}.
 * OO doesn't allow me to tell u my great name.
 * I'm sorry about that.
 */

public interface ScannerInterface {
    /* Overview: 所有扫描器的接口类
     */

    public boolean repOK();
    /* @ Effects: \result==invariant(this).
    */

    public void scan();
    /* @ MODIFIES: None;
    @ EFFECTS: 扫描；
    */
}
