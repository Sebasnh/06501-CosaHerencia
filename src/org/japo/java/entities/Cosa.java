/*
 * Copyright 2020 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
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
package org.japo.java.entities;

import java.io.Serializable;
import org.japo.java.interfaces.ICosa;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Cosa implements ICosa, Serializable {

    private static final long serialVersionUID = 1L;

    public final boolean DEF_FRAGILIDADOK = false;

    protected boolean fragilidadOK;

    public Cosa() {
        fragilidadOK = DEF_FRAGILIDADOK;
    }

    public Cosa(boolean fragilidadOK) {
        this.fragilidadOK = fragilidadOK;
    }

    public final boolean isFragilidadOK() {
        return fragilidadOK;
    }

    public final void setFragilidadOK(boolean fragilidadOK) {
        this.fragilidadOK = fragilidadOK;
    }

    @Override
    public final boolean equals(Object o) {
        boolean testOK;
        if (o == null) {
            testOK = false;
        } else if (!(o instanceof Cosa)) {
            testOK = false;
        } else {
            testOK = fragilidadOK == ((Cosa) o).isFragilidadOK();
        }
        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.fragilidadOK ? 1 : 0);
        return hash;
    }

    @Override
    public final String toString() {
        return String.format("%s - %b", getClass().getSimpleName(), fragilidadOK);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(toString());
    }

}
