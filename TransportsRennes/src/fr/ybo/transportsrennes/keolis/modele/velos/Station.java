package fr.ybo.transportsrennes.keolis.modele.velos;

import android.location.Location;

import java.io.Serializable;

/**
 * Classe représentant une station de velo star.
 *
 * @author ybonnel
 */
public class Station implements Serializable {

	/**
	 * Serial.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Nombre de m�tres dans un kiloM�tre.
	 */
	private static final double NB_METRES_BY_KM = 1000;
	/**
	 * Multiplicateur de d�cimales pour l'affichage d'un km (10 pour une
	 * d�cimale).
	 */
	private static final double MULTI_DECIMALES_FOR_KM = 10;
	/**
	 * Num�ro de la station.
	 */
	private String number;
	/**
	 * Nom de la station.
	 */
	private String name;
	/**
	 * adresse de la station.
	 */
	private String adresse;

	/**
	 * Etat de la station.
	 */
	private boolean state;

	/**
	 * Latitude.
	 */
	private double latitude;

	/**
	 * Longitude.
	 */
	private double longitude;
	/**
	 * Places libres.
	 */
	private int slotsavailable;
	/**
	 * V�los libres.
	 */
	private int bikesavailable;
	/**
	 * Position.
	 */
	private int pos;
	/**
	 * Nom du district.
	 */
	private String district;
	/**
	 * Date de derni�re mise � jour.
	 */
	private String lastupdate;
	/**
	 * Distance � la position courante. Calcul�e par la m�thode
	 * {@link Station#calculDistance(Location)}.
	 */
	private Integer distance = null;

	/**
	 * Calcul la distance entre une location et la station.
	 *
	 * @param pCurrentLocation la location courante.
	 */
	public final void calculDistance(final Location pCurrentLocation) {
		if (pCurrentLocation != null) {
			final float[] distanceResult = new float[1];
			Location.distanceBetween(pCurrentLocation.getLatitude(), pCurrentLocation.getLongitude(), latitude, longitude, distanceResult);
			distance = (int) distanceResult[0];
		}
	}

	/**
	 * Format la distance.
	 *
	 * @return la distance formatt�e.
	 */
	public final String formatDistance() {
		if (distance == null) {
			return "";
		}
		if (distance < NB_METRES_BY_KM) {
			return distance + "m";
		} else {
			final double distanceKm = Math.round((double) distance / (NB_METRES_BY_KM - MULTI_DECIMALES_FOR_KM)) / MULTI_DECIMALES_FOR_KM;
			return distanceKm + "km";
		}
	}

	/**
	 * @return adresse.
	 */
	public final String getAdresse() {
		return adresse;
	}

	/**
	 * Getter.
	 *
	 * @return le nombre de velos libres.
	 */
	public final int getBikesavailable() {
		return bikesavailable;
	}

	/**
	 * Getter.
	 *
	 * @return la distance � la position courante.
	 */
	public final Integer getDistance() {
		return distance;
	}

	/**
	 * Getter.
	 *
	 * @return le nom du district.
	 */
	public final String getDistrict() {
		return district;
	}

	/**
	 * Getter.
	 *
	 * @return la date de derni�re mise � jour.
	 */
	public final String getLastupdate() {
		return lastupdate;
	}

	/**
	 * Getter.
	 *
	 * @return la latitude.
	 */
	public final double getLatitude() {
		return latitude;
	}

	/**
	 * Getter.
	 *
	 * @return la longitude.
	 */
	public final double getLongitude() {
		return longitude;
	}

	/**
	 * Getter.
	 *
	 * @return nom de la station.
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Getter.
	 *
	 * @return num�ro de la station.
	 */
	public final String getNumber() {
		return number;
	}

	/**
	 * Getter.
	 *
	 * @return la position.
	 */
	public final int getPos() {
		return pos;
	}

	/**
	 * Getter.
	 *
	 * @return le nombre de places libres.
	 */
	public final int getSlotsavailable() {
		return slotsavailable;
	}

	/**
	 * Getter.
	 *
	 * @return �tat de la station.
	 */
	public final boolean getState() {
		return state;
	}

	/**
	 * @param pAdresse l'adresse.
	 */
	public final void setAdresse(final String pAdresse) {
		adresse = pAdresse;
	}

	/**
	 * Setter.
	 *
	 * @param pBikesavailable nombre de v�los libres.
	 */
	public final void setBikesavailable(final int pBikesavailable) {
		bikesavailable = pBikesavailable;
	}

	public void setDistance(final Integer newDistance) {
		distance = newDistance;
	}

	/**
	 * Setter.
	 *
	 * @param pDistrict le nom du district.
	 */
	public final void setDistrict(final String pDistrict) {
		district = pDistrict;
	}

	/**
	 * Setter.
	 *
	 * @param pLastupdate la date de derni�re mise � jour.
	 */
	public final void setLastupdate(final String pLastupdate) {
		lastupdate = pLastupdate;
	}

	/**
	 * Setter.
	 *
	 * @param pLatitude la latitude.
	 */
	public final void setLatitude(final double pLatitude) {
		latitude = pLatitude;
	}

	/**
	 * Setter.
	 *
	 * @param pLongitude la longitude.
	 */
	public final void setLongitude(final double pLongitude) {
		longitude = pLongitude;
	}

	/**
	 * Setter.
	 *
	 * @param pName nom du district.
	 */
	public final void setName(final String pName) {
		name = pName;
	}

	/**
	 * Setter.
	 *
	 * @param pNumber le num�ro de la station.
	 */
	public final void setNumber(final String pNumber) {
		number = pNumber;
	}

	/**
	 * Setter.
	 *
	 * @param pPos la position.
	 */
	public final void setPos(final int pPos) {
		pos = pPos;
	}

	/**
	 * Setter.
	 *
	 * @param pSlotsavailable le nombre de places libres.
	 */
	public final void setSlotsavailable(final int pSlotsavailable) {
		slotsavailable = pSlotsavailable;
	}

	/**
	 * Setter.
	 *
	 * @param pState �tat de la station.
	 */
	public final void setState(final boolean pState) {
		state = pState;
	}

	/**
	 * @return String.
	 * @see Object#toString().
	 */
	@Override
	public final String toString() {
		return new StringBuilder(name).append(' ').append(bikesavailable).append('/').append((slotsavailable + bikesavailable)).append("  ")
				.append(formatDistance()).toString();
	}
}