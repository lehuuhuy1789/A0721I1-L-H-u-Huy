package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc ");
        int nhap = sc.nextInt();
        if (nhap >= 0 && nhap <= 999) {
            if (nhap < 10) {
                switch(nhap) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                }
            } else {
                int hundred;
                if (nhap < 20) {
                    hundred = nhap % 10;
                    switch(hundred) {
                        case 0:
                            System.out.println("Ten");
                            break;
                        case 1:
                            System.out.println("Eleven");
                            break;
                        case 2:
                            System.out.println("Twelve");
                            break;
                        case 3:
                            System.out.println("Thirteen");
                            break;
                        case 4:
                            System.out.println("Fourteen");
                            break;
                        case 5:
                            System.out.println("Fifteen");
                            break;
                        case 6:
                            System.out.println("Sixteen");
                            break;
                        case 7:
                            System.out.println("Seventeen");
                            break;
                        case 8:
                            System.out.println("Eighteen");
                            break;
                        case 9:
                            System.out.println("Nineteen");
                    }
                } else {
                    int ones;
                    String hundredString;
                    if (nhap < 100) {
                        hundred = nhap / 10;
                        ones = nhap % 10;
                        String tentString = "";
                        hundredString = "";
                        switch(hundred) {
                            case 2:
                                tentString = "Twenty";
                                break;
                            case 3:
                                tentString = "Thirty";
                                break;
                            case 4:
                                tentString = "Forty";
                                break;
                            case 5:
                                tentString = "Fifty";
                                break;
                            case 6:
                                tentString = "Sixty";
                                break;
                            case 7:
                                tentString = "Seventy";
                                break;
                            case 8:
                                tentString = "Eighty";
                                break;
                            case 9:
                                tentString = "Ninety";
                        }

                        switch(ones) {
                            case 0:
                            default:
                                break;
                            case 1:
                                hundredString = "one";
                                break;
                            case 2:
                                hundredString = "Two";
                                break;
                            case 3:
                                hundredString = "Three";
                                break;
                            case 4:
                                hundredString = "Four";
                                break;
                            case 5:
                                hundredString = "Five";
                                break;
                            case 6:
                                hundredString = "Six";
                                break;
                            case 7:
                                hundredString = "Seven";
                                break;
                            case 8:
                                hundredString = "Eight";
                                break;
                            case 9:
                                hundredString = "Nine";
                        }

                        System.out.println(tentString + "-" + hundredString);
                    } else {
                        hundred = nhap / 100;
                        ones = nhap % 10;
                        int tens = (nhap - hundred * 100) / 10;
                        hundredString = "";
                        String tensString = "";
                        String onesString = "";
                        switch(hundred) {
                            case 1:
                                hundredString = "One Hundred";
                                break;
                            case 2:
                                hundredString = "Two Hundred";
                                break;
                            case 3:
                                hundredString = "Three Hundred";
                                break;
                            case 4:
                                hundredString = "Four Hundred";
                                break;
                            case 5:
                                hundredString = "Five Hundred";
                                break;
                            case 6:
                                hundredString = "Six Hundred";
                                break;
                            case 7:
                                hundredString = "Seven Hundred";
                                break;
                            case 8:
                                hundredString = "Eight Hundred";
                                break;
                            case 9:
                                hundredString = "Nine Hundred";
                        }

                        label109:
                        switch(tens) {
                            case 0:
                            default:
                                break;
                            case 1:
                                int nhapHangChuc = nhap - hundred * 100;
                                switch(nhapHangChuc) {
                                    case 10:
                                        tensString = "Ten";
                                        break label109;
                                    case 11:
                                        tensString = "Eleven";
                                        break label109;
                                    case 12:
                                        tensString = "Twelve";
                                        break label109;
                                    case 13:
                                        tensString = "Thirteen";
                                        break label109;
                                    case 14:
                                        tensString = "Fourteen";
                                        break label109;
                                    case 15:
                                        tensString = "Fifteen";
                                        break label109;
                                    case 16:
                                        tensString = "Sixteen";
                                        break label109;
                                    case 17:
                                        tensString = "Seventeen";
                                        break label109;
                                    case 18:
                                        tensString = "Eighteen";
                                        break label109;
                                    case 19:
                                        tensString = "Nineteen";
                                    default:
                                        break label109;
                                }
                            case 2:
                                tensString = "Twenty";
                                break;
                            case 3:
                                tensString = "Thirty";
                                break;
                            case 4:
                                tensString = "Forty";
                                break;
                            case 5:
                                tensString = "Fifty";
                                break;
                            case 6:
                                tensString = "Sixty";
                                break;
                            case 7:
                                tensString = "Seventy";
                                break;
                            case 8:
                                tensString = "Eighty";
                                break;
                            case 9:
                                tensString = "Ninety";
                        }

                        if (tens != 1) {
                            switch(ones) {
                                case 0:
                                default:
                                    break;
                                case 1:
                                    onesString = "One";
                                    break;
                                case 2:
                                    onesString = "Two";
                                    break;
                                case 3:
                                    onesString = "Three";
                                    break;
                                case 4:
                                    onesString = "Four";
                                    break;
                                case 5:
                                    onesString = "Five";
                                    break;
                                case 6:
                                    onesString = "Six";
                                    break;
                                case 7:
                                    onesString = "Seven";
                                    break;
                                case 8:
                                    onesString = "Eight";
                                    break;
                                case 9:
                                    onesString = "Nine";
                            }
                        }

                        System.out.println(hundredString + " and " + tensString + " " + onesString);
                    }
                }
            }
        } else {
            System.out.println("Out of ability");
        }
    }
}
