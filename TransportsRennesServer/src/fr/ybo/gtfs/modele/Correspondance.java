/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package fr.ybo.gtfs.modele;


import fr.ybo.gtfs.csv.annotation.BaliseCsv;
import fr.ybo.gtfs.csv.annotation.FichierCsv;

@FichierCsv("correspondances.txt")
public class Correspondance {

	@BaliseCsv("arretId")
	public String arretId;
	@BaliseCsv("correspondanceId")
	public String correspondanceId;

	public Correspondance(String arretId, String correspondanceId) {
		this.arretId = arretId;
		this.correspondanceId = correspondanceId;
	}

	public Correspondance() {
	}
}