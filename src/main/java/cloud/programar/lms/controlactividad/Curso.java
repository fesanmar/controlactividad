/*
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
package cloud.programar.lms.controlactividad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * Incluye información con el resúmen de las actividades que se han llevado
 * a cabo en un determinado curso. 
 * 
 * @author ciberado
 */
@Data 
// suppressConstructorProperties is mandatory because AllArgsConstructor interacts with JsonIgnore
@AllArgsConstructor(suppressConstructorProperties = true) 
@NoArgsConstructor
public class Curso {
    String codigo;
    String titulo;
    int unidadesDidacticasCompletadas;
    /* Las unidades didácticas son recursos con URLs independientes a las de un
       curso y por lo tanto no deseamos incrustarlas directamente en la representación
       de un curso: en su lugar las convertiremos en resources.
    */
    @JsonIgnore
    List<UnidadDidactica> unidadesDidacticas = new ArrayList<>();
}