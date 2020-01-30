/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
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
package org.japo.java.app;

import org.japo.java.entities.Trasto;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public final class App {

    public final void launchApp() {

        //Trasto 1 por defecto
        System.out.println("Trasto 1");
        System.out.println("========");
        Trasto t1 = new Trasto();
        t1.mostrarInfo();
        System.out.println("Actualizando ...");
        t1.setFragilidadOK(false);
        t1.mostrarInfo();

        //Separador
        System.out.println("---");

        //Trasto 2 parametrizado
        System.out.println("Trasto 2");
        System.out.println("========");
        Trasto t2 = new Trasto();
        t2.mostrarInfo();
        System.out.println("Actualizando ...");
        t2.setFragilidadOK(true);
        t2.mostrarInfo();

    }

}
