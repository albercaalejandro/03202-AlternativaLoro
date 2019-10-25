/* 
 * Copyright 2019 Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package alternativaloro;

import java.util.Scanner;

/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */
public class Main {
    
public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static void main(String[] args) {
    final String NOMBRE_AMO = "Sócrates";
    final String MSG_SI = "¡Ave César!";
    final String MSG_NO = "¡Sócrates socorro!";
    String mensajeLoro;
        System.out.println("Alternativa Loro");
        System.out.println("================");
        System.out.print("Persona que se acerca ..:");
    
        String nombrePersona = SCN.nextLine();
    
        System.out.println("---");
        System.out.println("Dueño del loro .........: "+nombrePersona);
        System.out.println("---");
    if (nombrePersona.equals(NOMBRE_AMO)){
    mensajeLoro = MSG_SI;
    } else {
            mensajeLoro = MSG_NO;
    }
    
        System.out.println("Mensaje Loro ...........:"+ mensajeLoro);
    
    
    }
}
