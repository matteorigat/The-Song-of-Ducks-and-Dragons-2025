
// https://everybody.codes/event/2025/quests/1


// part 1
public class Main{

    public static void main(String[] args){

        String input = "Agnarsin,Erasfelix,Arvvyr,Quormyr,Malmirath,Qalsar,Aeoririn,Zynthyn,Rysspyxis,Kronadarin";
        String input2 = "L5,R9,L8,R9,L1,R3,L2,R8,L9,R4,L3";
    
        String[] names = input.split(",");
        String[] moves = input2.split(",");

        int index = 0;

        for(String s: moves){
            if(s.charAt(0) == 'L'){
                index -= s.charAt(1) - '0';
                if(index < 0) index = 0;
            }
            else{
                index += s.charAt(1) - '0';
                if(index >= names.length) index = names.length-1;
            }
        }

        System.out.println(names[index]); // Erasfelix

    }
}



// part 2
public class Main{

    public static void main(String[] args){

        String input = "Dalonar,Laziral,Nysszral,Olarxaril,Kazoth,Zarxelor,Xansar,Drazgyth,Naldfarin,Wyrmarn,Marlon,Ulknar,Hazverax,Dalvoran,Havural,Zraalzeth,Aeliththyris,Norakyth,Glynnisis,Syllorath";
        String input2 = "L7,R5,L8,R14,L5,R6,L16,R5,L15,R18,L5,R14,L5,R18,L5,R18,L5,R14,L5,R17,L12,R13,L15,R18,L9,R19,L10,R6,L5";
    
        String[] names = input.split(",");
        String[] moves = input2.split(",");

        int index = 0;

        for(String s: moves){
            int val = 0;
            for (int i = 1; i < s.length(); i++) {
                val = val * 10 + (s.charAt(i) - '0');
            }
            if(s.charAt(0) == 'L'){
                index -= val;
                if(index < 0) index += names.length;

            }
            else{
                index = (index + val) % names.length;
            }
        }

        System.out.println(names[index]);  // Glynnisis

    }
}




// part 3
public class Main{

    public static void main(String[] args){

        String input = "Palthalar,Kharmarn,Maralzris,Oryor,Torzyth,Urdra,Hazzeth,Naldaes,Narzrak,Thymral,Fereth,Oronkyr,Lazirlyr,Glaurnylor,Tarlquin,Zarathural,Harmal,Shaelthar,Lorsar,Tharurath,Qalralis,Quenadir,Orykyris,Adalralis,Arkrilor,Quirthyris,Yndadarin,Elvarurath,Lornsyron,Selkzor";
        String input2 = "L19,R29,L13,R7,L11,R43,L41,R34,L34,R8,L5,R21,L31,R22,L31,R47,L36,R19,L6,R19,L5,R30,L5,R5,L5,R8,L5,R28,L5,R17,L5,R16,L5,R40,L5,R10,L5,R20,L5,R29,L40,R21,L46,R34,L35,R10,L25,R6,L39,R48,L45,R21,L48,R24,L22,R42,L37,R17,L11";
    
        String[] names = input.split(",");
        String[] moves = input2.split(",");

        int index = 0;
        String curr = names[0];

        for(String s: moves){
            int val = 0;
            for (int i = 1; i < s.length(); i++) {
                val = val * 10 + (s.charAt(i) - '0');
            }
            if(s.charAt(0) == 'L'){
                index = (index - val) % names.length;
                if(index < 0) index += names.length;
            }
            else{
                index = (index + val) % names.length;
            }

            names[0] = names[index];
            names[index] = curr;
            curr = names[0];
            index = 0;
        }

        System.out.println(names[index]);  // Selkzor

    }
}





