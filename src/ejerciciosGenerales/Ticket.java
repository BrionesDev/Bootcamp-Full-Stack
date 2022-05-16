package ejerciciosGenerales;

/**
 *
 * @author Elian Briones
 */
public class Ticket {

    String ownerName;
    int priNum;
    int segNum;
    int terNum;
    boolean isValid;
    boolean isExpired;
    int quantityGuesses;

    public Ticket(String ownerName) {
        this.ownerName = ownerName;
        priNum = -1;
        segNum = -1;
        terNum = -1;
        isValid = false;
        isExpired = false;
        quantityGuesses = 0;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getPriNum() {
        return priNum;
    }

    public int getSegNum() {
        return segNum;
    }

    public int getTerNum() {
        return terNum;
    }

    public boolean isIsValid() {
        return isValid;
    }

    public boolean isIsExpired() {
        return isExpired;
    }

    public void setPriNum(int priNum) {
        if (checkValidation(priNum)) {
            this.priNum = priNum;
        } else {
            System.out.println("Operation canceled!");
        }
    }

    public void setSegNum(int segNum) {
        if (checkValidation(segNum)) {
            this.segNum = segNum;
        } else {
            System.out.println("Operation canceled!");
        }
    }

    public void setTerNum(int terNum) {
        if (checkValidation(terNum)) {
            this.terNum = terNum;
        } else {
            System.out.println("Operation canceled!");
        }
    }

    public boolean checkValidation(int num) {
        return !isValid && !isExpired && (num >= 1 && num <= 49);
    }

    public boolean validate(int first, int second, int third) {
        if (!isExpired) {
            if ((first != -1 && second != -1 && third != -1)
                    && (first != second && second != third && first != third)) {
                isValid = true;
                System.out.println("Ticket of " + getOwnerName() + " is validated :)");
                return true;
            } else {
                System.out.println("Some number of your ticket is -1 or they are repeated");
                return false;
            }
        } else {
            System.out.println("Your ticket is expired!!");
            return false;
        }
    }

    public void reUse() {
        isExpired = false;
        isValid = false;
    }

    public int countRightGuesses(int first, int second, int third) {
        if (!isValid || isExpired) {
            return 0;
        }
        if (isValid && !isExpired) {
            isExpired = true;
            if (priNum == first || segNum == first || terNum == first
                || priNum == second || segNum == second || terNum == second
                || priNum == third || segNum == third || terNum == third) {
                quantityGuesses++;
            }
        }
        return quantityGuesses;
    }

}
