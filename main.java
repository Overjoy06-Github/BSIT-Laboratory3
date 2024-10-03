package com.mycompany.lrtstation;
import javax.swing.JOptionPane;

public class Lrtstation {

    public static void main(String[] args) {
        String toStation, fromStation;
        fromStation = JOptionPane.showInputDialog(null, "Which station are you currently in? \nUse the following as a guideline: \n\nA. Recto\nB. Legarda\nC. Pureza\nD. V. Mapa\nE. J. Ruiz\nF. Gilmore\nG. Betty Go-Belmonte\nH. Arantea-Cubao\nI. Anonas\nJ. Katipunan\nK. Santolan" ,"Current LRT Station", JOptionPane.INFORMATION_MESSAGE).toLowerCase();
        toStation = JOptionPane.showInputDialog(null, "What station would you like to exit?\nUse the following as a guideline: \n\nA. Recto\nB. Legarda\nC. Pureza\nD. V. Mapa\nE. J. Ruiz\nF. Gilmore\nG. Betty Go-Belmonte\nH. Arantea-Cubao\nI. Anonas\nJ. Katipunan\nK. Santolan" ,"LRT Station Destination", JOptionPane.INFORMATION_MESSAGE).toLowerCase();
        
        if (fromStation.equals(toStation)) {
            JOptionPane.showMessageDialog(null, "Invalid Station, please check the input.", "Error: Same Station Names", JOptionPane.ERROR_MESSAGE);
        }
        else {
            switch (fromStation) {
                case "a": case "recto":
                    switch (toStation) {
                        case "b": case "legarda":
                            JOptionPane.showMessageDialog(null, "You went from Recto Station to Legarda Station\n\nFare Price: ₱12", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "c": case "pureza":
                            JOptionPane.showMessageDialog(null, "You went from Recto Station to Pureza Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "d": case "v. mapa":
                            JOptionPane.showMessageDialog(null, "You went from Recto Station to V. Mapa Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "e": case "j. ruiz":
                            JOptionPane.showMessageDialog(null, "You went from Recto Station to J. Ruiz Station\n\nFare Price: ₱16", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "f": case "gilmore":
                            JOptionPane.showMessageDialog(null, "You went from Recto Station to Gilmore Station\n\nFare Price: ₱17", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "g": case "betty go-belmonte":
                            JOptionPane.showMessageDialog(null, "You went from Recto Station to Betty Go-Belmonte Station\n\nFare Price: ₱18", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "h": case "arantea-cubao":
                            JOptionPane.showMessageDialog(null, "You went from Recto Station to Arantea - Cubao Station\n\nFare Price: ₱19", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "i": case "anonas":
                            JOptionPane.showMessageDialog(null, "You went from Recto Station to Anonas Station\n\nFare Price: ₱21", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "j": case "katipunan":
                            JOptionPane.showMessageDialog(null, "You went from Recto Station to Katipunan Station\n\nFare Price: ₱22", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "k": case "santolan":
                            JOptionPane.showMessageDialog(null, "You went from Recto Station to Santolan Station\n\nFare Price: ₱24", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Something went wrong, try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                case "b": case "legarda":
                    switch (toStation) {
                        case "a": case "recto":
                            JOptionPane.showMessageDialog(null, "You went from Legarda Station to Recto Station\n\nFare Price: ₱12", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "c": case "pureza":
                            JOptionPane.showMessageDialog(null, "You went from Legarda Station to Pureza Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "d": case "v. map":
                            JOptionPane.showMessageDialog(null, "You went from Legarda Station to V. Mapa Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "e": case "j. ruiz":
                            JOptionPane.showMessageDialog(null, "You went from Legarda Station to J. Ruiz Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "f": case "gilmore":
                            JOptionPane.showMessageDialog(null, "You went from Legarda Station to Gilmore Station\n\nFare Price: ₱16", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "g": case "betty go-belmonte":
                            JOptionPane.showMessageDialog(null, "You went from Legarda Station to Betty Go-Belmonte Station\n\nFare Price: ₱17", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "h": case "arantea-cubao":
                            JOptionPane.showMessageDialog(null, "You went from Legarda Station to Arantea - Cubao Station\n\nFare Price: ₱18", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "i": case "anonas":
                            JOptionPane.showMessageDialog(null, "You went from Legarda Station to Anonas Station\n\nFare Price: ₱20", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "j": case "katipunan":
                            JOptionPane.showMessageDialog(null, "You went from Legarda Station to Katipunan Station\n\nFare Price: ₱21", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "k": case "santolan":
                            JOptionPane.showMessageDialog(null, "You went from Legarda Station to Santolan Station\n\nFare Price: ₱23", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Something went wrong, try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                case "c": case "pureza":
                    switch (toStation) {
                        case "a": case "recto":
                            JOptionPane.showMessageDialog(null, "You went from Pureza Station to Recto Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "b": case "legarda":
                            JOptionPane.showMessageDialog(null, "You went from Pureza Station to Legarda Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "d": case "v. map":
                            JOptionPane.showMessageDialog(null, "You went from Pureza Station to V. Map Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "e": case "j. ruiz":
                            JOptionPane.showMessageDialog(null, "You went from Pureza Station to J. Ruiz Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "f": case "gilmore":
                            JOptionPane.showMessageDialog(null, "You went from Pureza Station to Gilmore Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "g": case "betty go-belmonte":
                            JOptionPane.showMessageDialog(null, "You went from Pureza Station to Betty Go-Belmonte Station\n\nFare Price: ₱16", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "h": case "arantea-cubao":
                            JOptionPane.showMessageDialog(null, "You went from Pureza Station to Arantea - Cubao Station\n\nFare Price: ₱17", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "i": case "anonas":
                            JOptionPane.showMessageDialog(null, "You went from Pureza Station to Anonas Station\n\nFare Price: ₱19", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "j": case "katipunan":
                            JOptionPane.showMessageDialog(null, "You went from Pureza Station to Katipunan Station\n\nFare Price: ₱20", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "k": case "santolan":
                            JOptionPane.showMessageDialog(null, "You went from Pureza Station to Santolan Station\n\nFare Price: ₱22", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Something went wrong, try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                case "d": case "v. mapa":
                    switch (toStation) {
                        case "a": case "recto":
                            JOptionPane.showMessageDialog(null, "You went from V. Mapa Station to Recto Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "b": case "legarda":
                            JOptionPane.showMessageDialog(null, "You went from V. Mapa Station to Legarda Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "c": case "pureza":
                            JOptionPane.showMessageDialog(null, "You went from V. Mapa Station to Pureza Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "e": case "j. ruiz":
                            JOptionPane.showMessageDialog(null, "You went from V. Mapa Station to J. Ruiz Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "f": case "gilmore":
                            JOptionPane.showMessageDialog(null, "You went from V. Mapa Station to Gilmore Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "g": case "betty go-belmonte":
                            JOptionPane.showMessageDialog(null, "You went from V. Mapa Station to Betty Go-Belmonte Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "h": case "arantea-cubao":
                            JOptionPane.showMessageDialog(null, "You went from V. Mapa Station to Arantea - Cubao Station\n\nFare Price: ₱16", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "i": case "anonas":
                            JOptionPane.showMessageDialog(null, "You went from V. Mapa Station to Anonas Station\n\nFare Price: ₱18", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "j": case "katipunan":
                            JOptionPane.showMessageDialog(null, "You went from V. Mapa Station to Katipunan Station\n\nFare Price: ₱19", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "k": case "santolan":
                            JOptionPane.showMessageDialog(null, "You went from V. Mapa Station to Santolan Station\n\nFare Price: ₱21", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Something went wrong, try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                case "e": case "j. ruiz":
                    switch (toStation) {
                        case "a": case "recto":
                            JOptionPane.showMessageDialog(null, "You went from J. Ruiz Station to Recto Station\n\nFare Price: ₱16", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "b": case "legarda":
                            JOptionPane.showMessageDialog(null, "You went from J. Ruiz Station to Legarda Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "c": case "pureza":
                            JOptionPane.showMessageDialog(null, "You went from J. Ruiz Station to Pureza Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "d": case "v. mapa":
                            JOptionPane.showMessageDialog(null, "You went from J. Ruiz Station to V. Mapa Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "f": case "gilmore":
                            JOptionPane.showMessageDialog(null, "You went from J. Ruiz Station to Gilmore Station\n\nFare Price: ₱12", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "g": case "betty go-belmonte":
                            JOptionPane.showMessageDialog(null, "You went from J. Ruiz Station to Betty Go-Belmonte Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "h": case "arantea-cubao":
                            JOptionPane.showMessageDialog(null, "You went from J. Ruiz Station to Arantea - Cubao Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "i": case "anonas":
                            JOptionPane.showMessageDialog(null, "You went from J. Ruiz Station to Anonas Station\n\nFare Price: ₱16", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "j": case "katipunan":
                            JOptionPane.showMessageDialog(null, "You went from J. Ruiz Station to Katipunan Station\n\nFare Price: ₱17", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "k": case "santolan":
                            JOptionPane.showMessageDialog(null, "You went from J. Ruiz Station to Santolan Station\n\nFare Price: ₱19", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Something went wrong, try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                case "f": case "gilmore":
                    switch (toStation) {
                        case "a": case "recto":
                            JOptionPane.showMessageDialog(null, "You went from Gilmore Station to Recto Station\n\nFare Price: ₱17", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "b": case "legarda":
                            JOptionPane.showMessageDialog(null, "You went from Gilmore Station to Legarda Station\n\nFare Price: ₱16", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "c": case "pureza":
                            JOptionPane.showMessageDialog(null, "You went from Gilmore Station to Pureza Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "d": case "v. mapa":
                            JOptionPane.showMessageDialog(null, "You went from Gilmore Station to V. Mapa Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "e": case "j. ruiz":
                            JOptionPane.showMessageDialog(null, "You went from Gilmore Station to J. Ruiz Station\n\nFare Price: ₱12", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "g": case "betty go-belmonte":
                            JOptionPane.showMessageDialog(null, "You went from Gilmore Station to Betty Go-Belmonte Station\n\nFare Price: ₱12", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "h": case "arantea-cubao":
                            JOptionPane.showMessageDialog(null, "You went from Gilmore Station to Arantea - Cubao Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "i": case "anonas":
                            JOptionPane.showMessageDialog(null, "You went from Gilmore Station to Anonas Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "j": case "katipunan":
                            JOptionPane.showMessageDialog(null, "You went from Gilmore Station to Katipunan Station\n\nFare Price: ₱16", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "k": case "santolan":
                            JOptionPane.showMessageDialog(null, "You went from Gilmore Station to Santolan Station\n\nFare Price: ₱18", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Something went wrong, try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                case "g": case "betty go-belmonte":
                    switch (toStation) {
                        case "a": case "recto":
                            JOptionPane.showMessageDialog(null, "You went from Betty Go-Belmonte Station to Recto Station\n\nFare Price: ₱18", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "b": case "legarda":
                            JOptionPane.showMessageDialog(null, "You went from Betty Go-Belmonte Station to Legarda Station\n\nFare Price: ₱17", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "c": case "pureza":
                            JOptionPane.showMessageDialog(null, "You went from Betty Go-Belmonte Station to Pureza Station\n\nFare Price: ₱16", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "d": case "v. mapa":
                            JOptionPane.showMessageDialog(null, "You went from Betty Go-Belmonte Station to V. Mapa Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "e": case "j. ruiz":
                            JOptionPane.showMessageDialog(null, "You went from Betty Go-Belmonte Station to J. Ruiz Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "f": case "gilmore":
                            JOptionPane.showMessageDialog(null, "You went from Betty Go-Belmonte Station to Gilmore Station\n\nFare Price: ₱12", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "h": case "arantea-cubao":
                            JOptionPane.showMessageDialog(null, "You went from Betty Go-Belmonte Station to Arantea - Cubao Station\n\nFare Price: ₱12", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "i": case "anonas":
                            JOptionPane.showMessageDialog(null, "You went from Betty Go-Belmonte Station to Anonas Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "j": case "katipunan":
                            JOptionPane.showMessageDialog(null, "You went from Betty Go-Belmonte Station to Katipunan Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "k": case "santolan":
                            JOptionPane.showMessageDialog(null, "You went from Betty Go-Belmonte Station to Santolan Station\n\nFare Price: ₱17", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Something went wrong, try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                case "h": case "arantea-cubao":
                    switch (toStation) {
                        case "a": case "recto":
                            JOptionPane.showMessageDialog(null, "You went from Arantea-Cubao Station to Recto Station\n\nFare Price: ₱19", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "b": case "legarda":
                            JOptionPane.showMessageDialog(null, "You went from Arantea-Cubao Station to Legarda Station\n\nFare Price: ₱18", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "c": case "pureza":
                            JOptionPane.showMessageDialog(null, "You went from Arantea-Cubao Station to Pureza Station\n\nFare Price: ₱17", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "d": case "v. mapa":
                            JOptionPane.showMessageDialog(null, "You went from Arantea-Cubao Station to V. Mapa Station\n\nFare Price: ₱16", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "e": case "j. ruiz":
                            JOptionPane.showMessageDialog(null, "You went from Arantea-Cubao Station to J. Ruiz Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "f": case "gilmore":
                            JOptionPane.showMessageDialog(null, "You went from Arantea-Cubao Station to Gilmore Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "g": case "betty go-belmonte":
                            JOptionPane.showMessageDialog(null, "You went from Arantea-Cubao Station to Betty Go-Belmonte Station\n\nFare Price: ₱12", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "i": case "anonas":
                            JOptionPane.showMessageDialog(null, "You went from Arantea-Cubao Station to Anonas Station\n\nFare Price: ₱12", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "j": case "katipunan":
                            JOptionPane.showMessageDialog(null, "You went from Arantea-Cubao Station to Katipunan Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "k": case "santolan":
                            JOptionPane.showMessageDialog(null, "You went from Arantea-Cubao Station to Santolan Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Something went wrong, try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                case "i": case "anonas":
                    switch (toStation) {
                        case "a": case "recto":
                            JOptionPane.showMessageDialog(null, "You went from Anonas Station to Recto Station\n\nFare Price: ₱21", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "b": case "legarda":
                            JOptionPane.showMessageDialog(null, "You went from Anonas Station to Legarda Station\n\nFare Price: ₱20", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "c": case "pureza":
                            JOptionPane.showMessageDialog(null, "You went from Anonas Station to Pureza Station\n\nFare Price: ₱19", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "d": case "v. mapa":
                            JOptionPane.showMessageDialog(null, "You went from Anonas Station to V. Mapa Station\n\nFare Price: ₱18", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "e": case "j. ruiz":
                            JOptionPane.showMessageDialog(null, "You went from Anonas Station to J. Ruiz Station\n\nFare Price: ₱16", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "f": case "gilmore":
                            JOptionPane.showMessageDialog(null, "You went from Anonas Station to Gilmore Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "g": case "betty go-belmonte":
                            JOptionPane.showMessageDialog(null, "You went from Anonas Station to Betty Go-Belmonte Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "h": case "arantea-cubao":
                            JOptionPane.showMessageDialog(null, "You went from Anonas Station to Arantea - Cubao Station\n\nFare Price: ₱12", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "j": case "katipunan":
                            JOptionPane.showMessageDialog(null, "You went from Anonas Station to Katipunan Station\n\nFare Price: ₱12", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "k": case "santolan":
                            JOptionPane.showMessageDialog(null, "You went from Anonas Station to Santolan Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Something went wrong, try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                case "j": case "katipunan":
                    switch (toStation) {
                        case "a": case "recto":
                            JOptionPane.showMessageDialog(null, "You went from Katipunan Station to Recto Station\n\nFare Price: ₱22", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "b": case "legarda":
                            JOptionPane.showMessageDialog(null, "You went from Katipunan Station to Legarda Station\n\nFare Price: ₱21", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "c": case "pureza":
                            JOptionPane.showMessageDialog(null, "You went from Katipunan Station to Pureza Station\n\nFare Price: ₱20", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "d": case "v. mapa":
                            JOptionPane.showMessageDialog(null, "You went from Katipunan Station to V. Mapa Station\n\nFare Price: ₱19", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "e": case "j. ruiz":
                            JOptionPane.showMessageDialog(null, "You went from Katipunan Station to J. Ruiz Station\n\nFare Price: ₱17", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "f": case "gilmore":
                            JOptionPane.showMessageDialog(null, "You went from Katipunan Station to Gilmore Station\n\nFare Price: ₱16", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "g": case "betty go-belmonte":
                            JOptionPane.showMessageDialog(null, "You went from Katipunan Station to Betty Go-Belmonte Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "h": case "arantea-cubao":
                            JOptionPane.showMessageDialog(null, "You went from Katipunan Station to Arantea - Cubao Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "i": case "anonas":
                            JOptionPane.showMessageDialog(null, "You went from Katipunan Station to Anonas Station\n\nFare Price: ₱12", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "k": case "santolan":
                            JOptionPane.showMessageDialog(null, "You went from Katipunan Station to Santolan Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Something went wrong, try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                case "k": case "santolan":
                    switch (toStation) {
                        case "a": case "recto":
                            JOptionPane.showMessageDialog(null, "You went from Santolan Station to Recto Station\n\nFare Price: ₱24", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "b": case "legarda":
                            JOptionPane.showMessageDialog(null, "You went from Santolan Station to Legarda Station\n\nFare Price: ₱23", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "c": case "pureza":
                            JOptionPane.showMessageDialog(null, "You went from Santolan Station to Pureza Station\n\nFare Price: ₱22", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "d": case "v. mapa":
                            JOptionPane.showMessageDialog(null, "You went from Santolan Station to V. Mapa Station\n\nFare Price: ₱21", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "e": case "j. ruiz":
                            JOptionPane.showMessageDialog(null, "You went from Santolan Station to J. Ruiz Station\n\nFare Price: ₱19", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "f": case "gilmore":
                            JOptionPane.showMessageDialog(null, "You went from Santolan Station to Gilmore Station\n\nFare Price: ₱18", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "g": case "betty go-belmonte":
                            JOptionPane.showMessageDialog(null, "You went from Santolan Station to Betty Go-Belmonte Station\n\nFare Price: ₱17", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "h": case "arantea-cubao":
                            JOptionPane.showMessageDialog(null, "You went from Santolan Station to Arantea - Cubao Station\n\nFare Price: ₱15", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "i": case "anonas":
                            JOptionPane.showMessageDialog(null, "You went from Santolan Station to Anonas Station\n\nFare Price: ₱14", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "j": case "katipunan":
                            JOptionPane.showMessageDialog(null, "You went from Santolan Station to Katipunan Station\n\nFare Price: ₱13", "LRT Station", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Something went wrong, try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
            }
        }
    }
}
