/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp37_consoleapp;

/**
 *
 * @author aqira
 */
public class App implements AppInterface {

    @Override
    public String methodString() {
        return "ga error nih";
    }

    @Override
    public String methodNambahin() {
        return "bisa ga sih";
    }

    @Override
    public String remote(boolean status) {
        String result;
        if (status) {
            result = "Nyala";
        } else {
            result = "Mati";
        }
        System.out.println("ini: " + result);
        return result;
    }

}
