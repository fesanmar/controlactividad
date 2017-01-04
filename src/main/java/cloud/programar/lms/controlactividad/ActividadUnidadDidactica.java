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
 */package cloud.programar.lms.controlactividad;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ciberado
 */
@Data @AllArgsConstructor @NoArgsConstructor
@JsonRootName("actividades")
public class ActividadUnidadDidactica {
    @JsonProperty("codigo-curso")
    String codigoCurso;
    
    String numero;
    String titulo;
    int completados;
    
    ZonedDateTime desde;
    ZonedDateTime hasta;
}
