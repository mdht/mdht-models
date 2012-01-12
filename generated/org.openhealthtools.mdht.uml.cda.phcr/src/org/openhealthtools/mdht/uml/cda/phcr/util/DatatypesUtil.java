/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ENXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;


public class DatatypesUtil {
		
	public static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
		
	public static final String NULL_FLAVOR = "_NF";
	public static NullFlavor UNK = NullFlavor.UNK;
	
	public static final String II_ROOT = "_ROOT";
	public static final String II_EXTENSION = "_EXT";
	
	public static final String AD_STREET = "_STREET";
	public static final String AD_CITY = "_CITY";
	public static final String AD_STATE = "_STATE";
	public static final String AD_POSTALCODE = "_POSTALCODE";
	public static final String AD_COUNTRY = "_COUNTRY";
	public static final String AD_USE = "_USE";
	
	public static final String PN_GIVEN_NAME = "_GIVEN";
	public static final String PN_FAMILY_NAME = "_FAMILY";
	
	public static final String TS_HIGH = "_HIGH";
	public static final String TS_LOW = "_LOW";
	
	public static final String PQ_UNIT = "_UNIT";
	
	public static final String ANY_TYPE = "_ANYTYPE";

	//Preferred delimiter may require modifications to the CD/CE method
	public static final String CODE_DELIMITER = "^";
	
	
	
	
	/**
	 * An identifier that uniquely identifies a thing or object.
	 * Properties - UID root, ST extension
	 * 
	 * File Input Examples:
	 * propKeyTarget = "LABORATORY_RESULT_OBSERVATION_ID"  
	 * 
	 * LABORATORY_RESULT_OBSERVATION_ID_NF = MSK
	 * 
	 * LABORATORY_RESULT_OBSERVATION_ID_ROOT = 1.3.6.1.4.1.19376.1.3.4
	 * LABORATORY_RESULT_OBSERVATION_ID_EXT = 1234
	 * 
	 * LABORATORY_RESULT_OBSERVATION_ID_ROOT = 1.3.6.1.4.1.19376.1.3.4
	 * LABORATORY_RESULT_OBSERVATION_ID_EXT = 1234
	 * LABORATORY_RESULT_OBSERVATION_ID_ROOT1 = 1.3.6.1.4.1.19376.1.3.4
	 * LABORATORY_RESULT_OBSERVATION_ID_EXT1 = 5678
	 * LABORATORY_RESULT_OBSERVATION_ID_ROOT2 = 1.3.6.1.4.1.19376.1.3.4
	 * LABORATORY_RESULT_OBSERVATION_ID_EXT2 = 9012
	 * 
	 * @param prop - properties file
	 * @param propKeyTarget - properties key
	 * @param isRequired - if true and file lacks data, returns value of NullFlavor constant UNK
	 * @return List<II>
	 */
	public static List<II> getPropertyII(Properties prop, String propKeyTarget, boolean isRequired) {
		
		List<II> idList = new ArrayList<II>();
		
		String key_root = propKeyTarget + II_ROOT;
		String key_extension = propKeyTarget + II_EXTENSION;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;

		int count = 0;
		boolean hasMore = true;
		String root = prop.getProperty(key_root, "");
		String extension = prop.getProperty(key_extension, "");
		String nullFlavor = prop.getProperty(key_nullFlavor, "");
		
		if (root != "" || extension != "" || nullFlavor != "") {
			while (hasMore) {
				String suffix = (count > 0 ? String.valueOf(count) : "");
				root = prop.getProperty(key_root + suffix, "");
				extension = prop.getProperty(key_extension + suffix, "");
				nullFlavor = prop.getProperty(key_nullFlavor + suffix, "");
				if (root == "" && extension == "" && nullFlavor == "") {
					hasMore = false;
				} else {
					count++;
					if (nullFlavor != null && nullFlavor.length() > 0) {
						NullFlavor nf = NullFlavor.getByName(nullFlavor);
						if (nf != null) {
							idList.add(Datatypes.createII(nf));
						} else {
							//TODO: log nullFlavor type error
							idList.add(Datatypes.createII(UNK));
						}
					} else if ((root != null && root.length() > 0) || (extension != null && extension.length() > 0)) {
						II id = Datatypes.createII();
						if (root != null && root.length() > 0) id.setRoot(root);
						if (extension != null && extension.length() > 0) id.setExtension(extension);
						idList.add(id);
					}
				}
			}
		}
		if (isRequired && idList.size() < 1) {
			idList.add(Datatypes.createII(UNK));
		}
		return idList;		
	}
	
	/**
	 * An identifier that uniquely identifies a thing or object.
	 * Properties - UID root, ST extension
	 * @param prop - properties file
	 * @param propKeyTarget - properties key
	 * @param listId - List<II> 
	 * @param showAll - if true and listId lacks data, sets empty properties key
	 */
	public static void setPropertyII(Properties prop, String propKeyTarget, List<II> listId, boolean showAll) {

		int counter = listId.size();
		if (counter < 1 && showAll) {
			setPropertyII(prop, propKeyTarget, null, counter, showAll);
		} else {
			for (int i=0; i < counter; i++) {
				setPropertyII(prop, propKeyTarget, listId.get(i), i, showAll);
			}
		}
	}
	
	/**
	 * An identifier that uniquely identifies a thing or object.
	 * Properties - UID root, ST extension
	 * @param prop - properties file
	 * @param propKeyTarget - properties key
	 * @param id - II
	 * @param showAll - if true and listId lacks data, sets empty properties key
	 */
	public static void setPropertyII(Properties prop, String propKeyTarget, II id, boolean showAll) {
		setPropertyII(prop, propKeyTarget, id, 0, showAll);
	}
	
	/**
	 * An identifier that uniquely identifies a thing or object.
	 * Properties - UID root, ST extension
	 * @param prop - properties file
	 * @param propKeyTarget - properties key
	 * @param id - II
	 * @param counter - properties key index
	 * @param showAll - if true and id lacks data, sets empty properties key
	 */
	private static void setPropertyII(Properties prop, String propKeyTarget, II id, int counter, boolean showAll) {
		
		String root = null;
		String extension = null;
		String nullFlavor = null;
			
		if (id != null) {
			if (id.isSetNullFlavor()) {
				nullFlavor = id.getNullFlavor().getLiteral();
			} else {
				if (id.getRoot() != null && id.getRoot().length() > 0) root = id.getRoot();
				if (id.getExtension() != null && id.getExtension().length() > 0) extension = id.getExtension();
			}
		}
		
		String key_root = propKeyTarget + II_ROOT;
		String key_extension = propKeyTarget + II_EXTENSION;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		setProperty(prop, counter > 0 ? key_root + counter: key_root, root, showAll);
		setProperty(prop, counter > 0 ? key_extension + counter : key_extension, extension, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavor + counter : key_nullFlavor, nullFlavor, showAll);
	}

	/**
	 * AD is primarily used to communicate data that will allow printing mail labels, that will allow a 
	 * person to physically visit that address. The postal address data type is not supposed to be a container
	 * for additional information that might be useful for finding geographic locations (e.g., GPS coordinates)
	 * or for performing epidemiological studies.
	 * Properties - street, city, state, postal code, country, use
	 * 
	 * File Input Examples:
	 * propKeyTarget = "HEADER_PATIENT_ADDR"  
	 * 
	 * HEADER_PATIENT_ADDR_NF = MSK
	 * 
	 * HEADER_PATIENT_ADDR_STREET = 2222 Main Street
	 * HEADER_PATIENT_ADDR_CITY = Janesville
	 * HEADER_PATIENT_ADDR_STATE = WI
	 * HEADER_PATIENT_ADDR_POSTALCODE = 53545
	 * HEADER_PATIENT_ADDR_COUNTRY = USA
	 * HEADER_PATIENT_ADDR_USE = H
	 * 
	 * @param prop - properties file
	 * @param propKeyTarget - properties key
	 * @param isRequired - if true and file lacks data, returns value of NullFlavor constant UNK
	 * @return List<AD>
	 */
	public static List<AD> getPropertyAD(Properties prop, String propKeyTarget, boolean isRequired) {
		
		List<AD> addressList = new ArrayList<AD>();
		
		String key_street = propKeyTarget + AD_STREET;
		String key_city = propKeyTarget + AD_CITY;
		String key_state = propKeyTarget + AD_STATE;
		String key_postalCode = propKeyTarget + AD_POSTALCODE;
		String key_country = propKeyTarget + AD_COUNTRY;
		String key_use = propKeyTarget + AD_USE;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		int count = 0;
		boolean hasMore = true;
		String street = prop.getProperty(key_street, "");
		String city = prop.getProperty(key_city, "");
		String state = prop.getProperty(key_state, "");
		String postalCode = prop.getProperty(key_postalCode, "");
		String country = prop.getProperty(key_country, "");
		String use = prop.getProperty(key_use, "");
		String nullFlavor = prop.getProperty(key_nullFlavor, "");	
		
		if (street != "" || city != "" || state != "" || postalCode != "" || country != "" || use != "" || nullFlavor != "") {
			while (hasMore) {
				String suffix = (count > 0 ? String.valueOf(count) : "");
				street = prop.getProperty(key_street + suffix, "");
				city = prop.getProperty(key_city + suffix, "");
				state = prop.getProperty(key_state + suffix, "");
				postalCode = prop.getProperty(key_postalCode + suffix, "");
				country = prop.getProperty(key_country + suffix, "");
				use = prop.getProperty(key_use + suffix, "");
				nullFlavor = prop.getProperty(key_nullFlavor + suffix, "");
				if (street == "" && city == "" && state == "" && postalCode == "" && country == "" && use == "" && nullFlavor == "") {
					hasMore = false;
				} else {
					count++;
					if (nullFlavor != null && nullFlavor.length() > 0) {
						NullFlavor nf = NullFlavor.getByName(nullFlavor);
						if (nf != null) {
							AD address = Datatypes.createAD();
							address.setNullFlavor(nf);
							addressList.add(address);
						} else {
							//TODO: log nullFlavor type error
							AD address = Datatypes.createAD();
							address.setNullFlavor(UNK);
							addressList.add(address);
						}
					} else if ((street != null && street.length() > 0) || 
							(city != null && city.length() > 0) || 
							(state != null && state.length() > 0) || 
							(postalCode != null && postalCode.length() > 0) || 
							(country != null && country.length() > 0) ||
							(use != null && use.length() > 0)) {
						AD address = Datatypes.createAD();
						if (street != null && street.length() > 0) address.addStreetAddressLine(street);
						if (city != null && city.length() > 0) address.addCity(city);
						if (state != null && state.length() > 0) address.addState(state);
						if (postalCode != null && postalCode.length() > 0) address.addPostalCode(postalCode);
						if (country != null && country.length() > 0) address.addCountry(country);
						if (use != null && use.length() > 0) {
							PostalAddressUse pau = PostalAddressUse.getByName(use);
							if (pau != null) {
								address.getUses().add(pau);
							} else {
								//TODO: log PostalAddressUse type error
							}
						}
						addressList.add(address);
					}					
				}
			}
		}
		if (isRequired && addressList.size() < 1) {
			AD address = Datatypes.createAD();
			address.setNullFlavor(UNK);
			addressList.add(address);
		}
		return addressList; 
	}
	
	/**
	 * AD is primarily used to communicate data that will allow printing mail labels, that will allow a 
	 * person to physically visit that address. The postal address data type is not supposed to be a container
	 * for additional information that might be useful for finding geographic locations (e.g., GPS coordinates)
	 * or for performing epidemiological studies.
	 * Properties - street, city, state, postal code, country 
	 * @param prop - properties file
	 * @param propKeyTarget  - properties key
	 * @param listAd - List<AD>
	 * @param showAll - if true and listId lacks data, sets empty properties key
	 */
	public static void setPropertyAD(Properties prop, String propKeyTarget, List<AD> listAd, boolean showAll) {
		
		int counter = listAd.size();
		
		if (counter < 1 && showAll) {
			setPropertyAD(prop, propKeyTarget, null, counter, showAll);
		} else {
			for (int i=0; i < counter; i++) {
				setPropertyAD(prop, propKeyTarget, listAd.get(i), i, showAll);
			}
		}
	}
	
	/**
	 * AD is primarily used to communicate data that will allow printing mail labels, that will allow a 
	 * person to physically visit that address. The postal address data type is not supposed to be a container
	 * for additional information that might be useful for finding geographic locations (e.g., GPS coordinates)
	 * or for performing epidemiological studies.
	 * Properties - street, city, state, postal code, country
	 * @param prop - properties file
	 * @param propKeyTarget  - properties key
	 * @param ad - AD
	 * @param showAll - if true and listId lacks data, sets empty properties key
	 */
	public static void setPropertyAD(Properties prop, String propKeyTarget, AD ad, boolean showAll) {
		setPropertyAD(prop, propKeyTarget, ad, 0, showAll);
	}
	
	/**
	 * AD is primarily used to communicate data that will allow printing mail labels, that will allow a 
	 * person to physically visit that address. The postal address data type is not supposed to be a container
	 * for additional information that might be useful for finding geographic locations (e.g., GPS coordinates)
	 * or for performing epidemiological studies.
	 * Properties - street, city, state, postal code, country
	 * @param prop - properties file
	 * @param propKeyTarget  - properties key
	 * @param ad - AD
	 * @param counter - properties key index
	 * @param showAll - if true and listId lacks data, sets empty properties key
	 */
	private static void setPropertyAD(Properties prop, String propKeyTarget, AD ad, int counter, boolean showAll) {

		String street = null;
		String city = null;
		String state = null;
		String postalCode = null;
		String country = null;
		String use = null;
		String nullFlavor = null;
		
		if (ad != null) {
			if (ad.isSetNullFlavor()) {
				nullFlavor = ad.getNullFlavor().getLiteral();
			} else {
				street = getAddressText(ad.getStreetAddressLines(), 0);
				city = getAddressText(ad.getCities(), 0);
				state = getAddressText(ad.getStates(), 0);
				postalCode = getAddressText(ad.getPostalCodes(), 0);
				country = getAddressText(ad.getCountries(), 0);
				List<PostalAddressUse> pauList = ad.getUses();
				if (pauList.size() > 0) {
					use = pauList.get(0).getName();
				}
			}
		}
		
		String key_street = propKeyTarget + AD_STREET;
		String key_city = propKeyTarget + AD_CITY;
		String key_state = propKeyTarget + AD_STATE;
		String key_postalCode = propKeyTarget + AD_POSTALCODE;
		String key_country = propKeyTarget + AD_COUNTRY;
		String key_use = propKeyTarget + AD_USE;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		setProperty(prop, counter > 0 ? key_street + counter : key_street, street, showAll);
		setProperty(prop, counter > 0 ? key_city + counter : key_city, city, showAll);
		setProperty(prop, counter > 0 ? key_state + counter : key_state, state, showAll);
		setProperty(prop, counter > 0 ? key_postalCode + counter: key_postalCode, postalCode, showAll);
		setProperty(prop, counter > 0 ? key_country + counter : key_country, country, showAll);
		setProperty(prop, counter > 0 ? key_use + counter : key_use, use, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavor + counter : key_nullFlavor, nullFlavor, showAll);
	}
	
	private static String getAddressText(List<ADXP> addressFieldList, int index) {
		
		String text = null;
		if (addressFieldList != null) {
			if (index < addressFieldList.size()) {
				ADXP addressField = addressFieldList.get(index);
				if (addressField != null) {
					text = addressField.getText();
				}
			}
		}
		return text;
	}
	
	
	public static List<TEL> getPropertyTEL(Properties prop, String propKeyTarget, boolean isRequired) {
		
		String key_telecom = propKeyTarget;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		int count = 0;
		boolean hasMore = true;
		
		String telecom = prop.getProperty(key_telecom, "");
		String nullFlavor = prop.getProperty(key_nullFlavor, "");
		
		if (telecom != "" || nullFlavor != "") {
			count++;
			while (hasMore) {
				telecom = prop.getProperty(key_telecom + count, "");
				nullFlavor = prop.getProperty(key_nullFlavor + count, "");
				if (telecom == "" && nullFlavor == "") {
					hasMore = false;
				} else {
					count++;
				}
			}
		}
		
		List<TEL> telecomList = new ArrayList<TEL>();
		
		for (int i=0; i < count; i++) {
			String suffix = (i > 0 ? String.valueOf(i) : "");
			telecom = prop.getProperty(key_telecom + suffix, "");
			nullFlavor = prop.getProperty(key_nullFlavor + suffix, "");
				
			if (nullFlavor != null && nullFlavor.length() > 0) {
				NullFlavor nf = NullFlavor.getByName(nullFlavor);
				if (nf != null) {
					TEL tel = Datatypes.createTEL();
					tel.setNullFlavor(nf);
					telecomList.add(tel);
				} else {
					//TODO: log nullFlavor type error
				}
			} else if (telecom.length() > 0) {
				telecomList.add(Datatypes.createTEL(telecom));
			}
		}

		if (isRequired && telecomList.size() < 1) {
			TEL tel = Datatypes.createTEL();
			tel.setNullFlavor(UNK);
			telecomList.add(tel);
		}
		return telecomList;
	}
	
	
	public static void setPropertyTEL(Properties prop, String propKeyTarget, List<TEL> listTel, boolean showAll) {
		
		int counter = listTel.size();
		
		if (counter < 1 && showAll) {
			setPropertyTEL(prop, propKeyTarget, null, counter, showAll);
		} else {
			for (int i=0; i < counter; i++) {
				setPropertyTEL(prop, propKeyTarget, listTel.get(i), i, showAll);
			}
		}
	}
	
	public static void setPropertyTEL(Properties prop, String propKeyTarget, TEL telecom, boolean showAll) {
		setPropertyTEL(prop, propKeyTarget, telecom, 0, showAll);
	}
	
	private static void setPropertyTEL(Properties prop, String propKeyTarget, TEL telecom, int counter, boolean showAll) {
		
		String tel = null;
		String nullFlavor = null;
		
		if (telecom != null) {
			if (telecom.isSetNullFlavor()) {
				nullFlavor = telecom.getNullFlavor().getLiteral();
			} else {
				if (telecom.getValue() != null && telecom.getValue().length() > 0) tel = telecom.getValue();
			}
		}
		
		String key_telecom = propKeyTarget;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		setProperty(prop, counter > 0 ? key_telecom + counter : key_telecom, tel, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavor + counter : key_nullFlavor, nullFlavor, showAll);
	}
	
	
	public static List<PN> getPropertyPN(Properties prop, String propKeyTarget, boolean isRequired) {
		
		String key_given = propKeyTarget + PN_GIVEN_NAME;
		String key_family = propKeyTarget + PN_FAMILY_NAME;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		int count = 0;
		boolean hasMore = true;
		
		String given = prop.getProperty(key_given, "");
		String family = prop.getProperty(key_family, "");
		String nullFlavor = prop.getProperty(key_nullFlavor, "");
		
		if (given != "" || family != "" || nullFlavor != "") {
			count++;
			while (hasMore) {
				given = prop.getProperty(key_given + count, "");
				family = prop.getProperty(key_family + count, "");
				nullFlavor = prop.getProperty(key_nullFlavor + count, "");
				if (given == "" && family == "" && nullFlavor == "") {
					hasMore = false;
				} else {
					count++;
				}
			}
		}
		
		List<PN> nameList = new ArrayList<PN>();
		
		for (int i=0; i < count; i++) {
			String suffix = (i > 0 ? String.valueOf(i) : "");
			given = prop.getProperty(key_given + suffix, "");
			family = prop.getProperty(key_family + suffix, "");
			nullFlavor = prop.getProperty(key_nullFlavor + suffix, "");
			if (nullFlavor != null && nullFlavor.length() > 0) {
				NullFlavor nf = NullFlavor.getByName(nullFlavor);
				if (nf != null) {
					PN name = Datatypes.createPN();
					name.setNullFlavor(nf);
					nameList.add(name);
				} else {
					//TODO: log nullFlavor type error
				}
			} else if (given.length() > 0 || family.length() > 0) {
				PN name = Datatypes.createPN();
				if (given.length() > 0) name.addGiven(given);
				if (family.length() > 0) name.addFamily(family);
				nameList.add(name);
			}
		}

		if (isRequired && nameList.size() < 1) {
			PN name = Datatypes.createPN();
			name.setNullFlavor(UNK);
			nameList.add(name);
		}
		return nameList;
	}
	
	
	public static void setPropertyPN(Properties prop, String propKeyTarget, List<PN> listPN, boolean showAll) {
		
		int counter = listPN.size();
		if (counter < 1 && showAll) {
			setPropertyPN(prop, propKeyTarget, null, counter, showAll);
		} else {
			for (int i=0; i < counter; i++) {
				setPropertyPN(prop, propKeyTarget, listPN.get(i), i, showAll);
			}
		}
	}
	
	public static void setPropertyPN(Properties prop, String propKeyTarget, PN personName, boolean showAll) {
		setPropertyPN(prop, propKeyTarget, personName, 0, showAll);
	}
	
	private static void setPropertyPN(Properties prop, String propKeyTarget, PN personName, int counter, boolean showAll) {
		
		String given = null;
		String family = null;
		String nullFlavor = null;
		
		if (personName != null) {
			if (personName.isSetNullFlavor()) {
				nullFlavor = personName.getNullFlavor().getLiteral();
			} else {
				given = getPersonNameText(personName.getGivens(), 0);
				family = getPersonNameText(personName.getFamilies(), 0);
			}
		}
		
		String key_given = propKeyTarget + PN_GIVEN_NAME;
		String key_family = propKeyTarget + PN_FAMILY_NAME;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		setProperty(prop, counter > 0 ? key_given + counter : key_given, given, showAll);
		setProperty(prop, counter > 0 ? key_family + counter : key_family, family, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavor + counter : key_nullFlavor, nullFlavor, showAll);
	}
	
	private static String getPersonNameText(List<ENXP> personNameList, int index) {
		
		String text = null;
		if (personNameList != null) {
			if (index < personNameList.size()) {
				ENXP personName = personNameList.get(index);
				if (personName != null) {
					text = personName.getText();
				}
			}
		}
		return text;
	}
	
	
	public static ON getPropertyON(Properties prop, String propKeyTarget, boolean isRequired) {
		
		ON organizationName = null;
		String on = prop.getProperty(propKeyTarget, "");
		String nullFlavor = prop.getProperty(propKeyTarget + NULL_FLAVOR, "");
		
		if (nullFlavor != null && nullFlavor.length() > 0) {
			NullFlavor nf = NullFlavor.getByName(nullFlavor);
			if (nf != null) {
				organizationName = Datatypes.createON();
				organizationName.setNullFlavor(nf);
			} else {
				//TODO: log nullFlavor type error
			}
		} else {
			if (on != null && on.length() > 0) {
				organizationName = Datatypes.createON();
				organizationName.addText(on);
			}
		}
		if (organizationName == null && isRequired) {
			organizationName = Datatypes.createON();
			organizationName.setNullFlavor(UNK);
		}
		return organizationName;
	}
	
	public static void setPropertyON(Properties prop, String propKeyTarget, List<ON> listON, boolean showAll) {
		
		int counter = listON.size();
		
		if (counter < 1 && showAll) {
			setPropertyON(prop, propKeyTarget, null, counter, showAll);
		} else {
			for (int i=0; i < counter; i++) {
				setPropertyON(prop, propKeyTarget, listON.get(i), i, showAll);
			}
		}
	}
	
	public static void setPropertyON(Properties prop, String propKeyTarget, ON name, boolean showAll) {
		setPropertyON(prop, propKeyTarget, name, 0, showAll);
	}
	
	public static void setPropertyON(Properties prop, String propKeyTarget, ON organizationName, int counter, boolean showAll) {
		
		String name = null;
		String nullFlavor = null;
		
		if (organizationName != null) {
			if (organizationName.isSetNullFlavor()) {
				nullFlavor = organizationName.getNullFlavor().getLiteral();
			} else {
				name = organizationName.getText();
			}
		}
		
		String key_name = propKeyTarget;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		setProperty(prop, counter > 0 ? key_name + counter : key_name, name, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavor + counter : key_nullFlavor, nullFlavor, showAll);
	}
	
	public static EN getPropertyEN(Properties prop, String propKeyTarget, boolean isRequired) {
		
		EN name = null;
		String nameString = prop.getProperty(propKeyTarget, "");
		String nullFlavor = prop.getProperty(propKeyTarget + NULL_FLAVOR, "");
		
		if (nullFlavor != null && nullFlavor.length() > 0) {
			NullFlavor nf = NullFlavor.getByName(nullFlavor);
			if (nf != null) {
				name = Datatypes.createEN();
				name.setNullFlavor(nf);
			} else {
				//TODO: log nullFlavor type error
			}
		} else {
			if (nameString != null && nameString.length() > 0) {
				name = Datatypes.createEN();
				name.addText(nameString);
			}
		}
		if (name == null && isRequired) {
			name = Datatypes.createEN();
			name.setNullFlavor(UNK);
		}
		return name;
	}
	
	public static void setPropertyEN(Properties prop, String propKeyTarget, EN name, boolean showAll) {
		setPropertyEN(prop, propKeyTarget, name, 0, showAll);
	}
	
	
	private static void setPropertyEN(Properties prop, String propKeyTarget, EN entityName, int counter, boolean showAll) {
		
		String name = null;
		String nullFlavor = null;
		
		if (entityName != null) {
			if (entityName.isSetNullFlavor()) {
				nullFlavor = entityName.getNullFlavor().getLiteral();
			} else {
				if (entityName.getMixed() != null) {
					FeatureMap textFeatureMap = entityName.getMixed();
					for (int i=0; i < textFeatureMap.size(); i++) {
						// TODO: this causes "nullName" bug
						name = name + (String) textFeatureMap.getValue(i);
					}
				}
			}
		}
		
		String key_name = propKeyTarget;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		if (counter > 0) {
			key_name = key_name + counter;
			key_nullFlavor = key_nullFlavor + counter;
		}
		
		setProperty(prop, counter > 0 ? key_name + counter : key_name, name, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavor + counter : key_nullFlavor, nullFlavor, showAll);
	}
	
	
	public static CE getPropertyCE(Properties prop, String propKeyTarget, boolean isRequired) {
		
		CE code = null;
		CD code_CD = getPropertyCD(prop, propKeyTarget, isRequired);
		if (code_CD != null) {
			code = Datatypes.createCE();
			if (code_CD.isSetNullFlavor()) {
				code.setNullFlavor(code_CD.getNullFlavor());
			} else {
				code.setCode(code_CD.getCode());
				code.setCodeSystem(code_CD.getCodeSystem());
				code.setCodeSystemName(code_CD.getCodeSystemName());
				code.setDisplayName(code_CD.getDisplayName());
			}
		}
		return code;
	}
	
	public static void setPropertyCE(Properties prop, String propKeyTarget, CE code, boolean showAll) {
		
		setPropertyCD(prop, propKeyTarget, (CD) code, 0, showAll);
	}
	
	public static void setPropertyCE(Properties prop, String propKeyTarget, CE code, int counter, boolean showAll) {
		
		setPropertyCD(prop, propKeyTarget, (CD) code, counter, showAll);
	}
	
	
	public static CD getPropertyCD(Properties prop, String propKeyTarget, boolean isRequired) {
		
		String code_CD = prop.getProperty(propKeyTarget);
		String nullFlavor = prop.getProperty(propKeyTarget + NULL_FLAVOR);
			
		CD code = null;
		if (nullFlavor != null && nullFlavor.length() > 0) {
			NullFlavor nf = NullFlavor.getByName(nullFlavor);
			if (nf != null) {
				code = Datatypes.createCD();
				code.setNullFlavor(nf);
			} else {
				//TODO: log nullFlavor type error
			}
		} else if (code_CD != null && code_CD.length() > 0) {
			code = Datatypes.createCD();
			String[] codeArray = code_CD.split("[//" + CODE_DELIMITER + "]");
			int count = codeArray.length;
			if (count > 0) code.setCode(codeArray[0]);
			if (count > 1) code.setCodeSystem(codeArray[1]);
			if (count > 2) code.setCodeSystemName(codeArray[2]);
			if (count > 3) code.setDisplayName(codeArray[3]);
		}
		if (code == null && isRequired) {
			code = Datatypes.createCD();
			code.setNullFlavor(UNK);
		}
		return code;
	}
	
	public static void setPropertyCD(Properties prop, String propKeyTarget, CD code, boolean showAll) {
		setPropertyCD(prop, propKeyTarget, code, 0, showAll);
	}
	
	public static void setPropertyCD(Properties prop, String propKeyTarget, CD code, int counter, boolean showAll) {
		
		String cd = null;
		String nullFlavor = null;
		
		if (code != null) {
			if (code.isSetNullFlavor()) {
				nullFlavor = code.getNullFlavor().getLiteral();
			} else {
				cd = extractCodeText(code);
			}
		}
		
		String key_code = propKeyTarget;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		setProperty(prop, counter > 0 ? key_code + counter : key_code, cd, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavor + counter : key_nullFlavor, nullFlavor, showAll);
	}
	
	private static String extractCodeText(CD code) {
		
		String text = CODE_DELIMITER + CODE_DELIMITER + CODE_DELIMITER;
		if (code != null) {
			if (code.getCode() != null) {
				text = code.getCode();
			}
			if (code.getCodeSystem() != null) {
				text = text + CODE_DELIMITER + code.getCodeSystem();
			} else {
				text = text + CODE_DELIMITER;
			}
			if (code.getCodeSystemName() != null) {
				text = text + CODE_DELIMITER + code.getCodeSystemName();
			} else {
				text = text + CODE_DELIMITER;
			}
			if (code.getDisplayName() != null) {
				text = text + CODE_DELIMITER + code.getDisplayName();
			} else {
				text = text + CODE_DELIMITER;
			}
		}
		return text;
	}
	
	
	public static TS getPropertyTS(Properties prop, String propKeyTarget, boolean isRequired) {
		
		String ts_value = prop.getProperty(propKeyTarget, "");
		String nullFlavor = prop.getProperty(propKeyTarget + NULL_FLAVOR, "");
		
		TS timeStamp = null;
		if (nullFlavor != null && nullFlavor.length() > 0) {
			NullFlavor nf = NullFlavor.getByName(nullFlavor);
			if (nf != null) {
				timeStamp = Datatypes.createTS();
				timeStamp.setNullFlavor(nf);
			} else {
				//TODO: log nullFlavor type error
			}
		} else if (ts_value != null && ts_value.length() > 0) {
			timeStamp = Datatypes.createTS(ts_value);
		}
		if (timeStamp == null && isRequired) {
			timeStamp = Datatypes.createTS();
			timeStamp.setNullFlavor(UNK);
		}
		return timeStamp;
	}
	
	
	public static void setPropertyTS(Properties prop, String propKeyTarget, TS timeStamp, boolean showAll) {
		
		setPropertyTS(prop, propKeyTarget, timeStamp, 0, showAll);
	}
	

	public static void setPropertyTS(Properties prop, String propKeyTarget, TS timeStamp, int counter, boolean showAll) {
		
		String value = null;
		String nullFlavor = null;
		
		if (timeStamp != null) {
			if (timeStamp.isSetNullFlavor()) {
				nullFlavor = timeStamp.getNullFlavor().getLiteral();
			} else {
				value = timeStamp.getValue();
			}
		}
		
		String key_value = propKeyTarget;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		setProperty(prop, counter > 0 ? key_value + counter : key_value, value, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavor + counter : key_nullFlavor, nullFlavor, showAll);
	}
	
	public static IVL_TS getPropertyIVL_TS(Properties prop, String propKeyTarget, boolean isRequired) {
		
		String et_value = prop.getProperty(propKeyTarget, "");
		String et_high = prop.getProperty(propKeyTarget + TS_HIGH, "");
		String et_low = prop.getProperty(propKeyTarget + TS_LOW, "");
		String nullFlavor = prop.getProperty(propKeyTarget + NULL_FLAVOR, "");
		String nullFlavorHigh = prop.getProperty(propKeyTarget + TS_HIGH + NULL_FLAVOR, "");
		String nullFlavorLow = prop.getProperty(propKeyTarget + TS_LOW + NULL_FLAVOR, ""); 
		
		IVL_TS effectiveTime = null;
		if (nullFlavor != null && nullFlavor.length() > 0) {
			NullFlavor nf = NullFlavor.getByName(nullFlavor);
			if (nf != null) {
				effectiveTime = Datatypes.createIVL_TS();
				effectiveTime.setNullFlavor(nf);
			} else {
				//TODO: log nullFlavor type error
			}
		} else if (et_value != null && et_value.length() > 0) {
			effectiveTime = Datatypes.createIVL_TS(et_value);
		} else {
			if (et_high != null && et_high.length() > 0) {
				IVXB_TS highTS = Datatypes.createIVXB_TS();
				highTS.setValue(et_high);
				effectiveTime = Datatypes.createIVL_TS();
				effectiveTime.setHigh(highTS);
			} else if (nullFlavorHigh != null && nullFlavorHigh.length() > 0) {
				NullFlavor nf = NullFlavor.getByName(nullFlavorHigh);
				if (nf != null) {
					IVXB_TS highTS = Datatypes.createIVXB_TS();
					highTS.setNullFlavor(nf);
					effectiveTime = Datatypes.createIVL_TS();
					effectiveTime.setHigh(highTS);
				}
			}
			if (et_low != null && et_low.length() > 0) {
				IVXB_TS lowTS = Datatypes.createIVXB_TS();
				lowTS.setValue(et_low);
				if (effectiveTime == null) {
					effectiveTime = Datatypes.createIVL_TS();
				}
				effectiveTime.setLow(lowTS);
			} else if (nullFlavorLow != null && nullFlavorLow.length() > 0) {
				NullFlavor nf = NullFlavor.getByName(nullFlavorLow);
				if (nf != null) {
					IVXB_TS lowTS = Datatypes.createIVXB_TS();
					lowTS.setNullFlavor(nf);
					if (effectiveTime == null) {
						effectiveTime = Datatypes.createIVL_TS();
					}
					effectiveTime.setLow(lowTS);
				}
			}
		}
		if (effectiveTime == null && isRequired) {
			effectiveTime = Datatypes.createIVL_TS();
			effectiveTime.setNullFlavor(UNK);
		}
		return effectiveTime;		
	}
	
	public static void setPropertyIVL_TS(Properties prop, String propKeyTarget, List<SXCM_TS> effectiveTimes, boolean showAll) {
		
		int counter = effectiveTimes.size();
		if (counter < 1 && showAll) {
			setPropertyIVL_TS(prop, propKeyTarget, null, counter, showAll);
		} else {
			for (int i=0; i < counter; i++) {
				setPropertyIVL_TS(prop, propKeyTarget, (IVL_TS) effectiveTimes.get(i), i, showAll);
			}
		}
	}
	
	public static void setPropertyIVL_TS(Properties prop, String propKeyTarget, IVL_TS effectiveTime, boolean showAll) {
		
		setPropertyIVL_TS(prop, propKeyTarget, effectiveTime, 0, showAll);
	}
	
	public static void setPropertyIVL_TS(Properties prop, String propKeyTarget, IVL_TS effectiveTime, int counter, boolean showAll) {
		
		String value = null;
		String high = null;
		String low = null;
		String nullFlavor = null;
		String nullFlavorHigh = null;
		String nullFlavorLow = null;
		
		if (effectiveTime != null) {
			if (effectiveTime.isSetNullFlavor()) {
				nullFlavor = effectiveTime.getNullFlavor().getLiteral();
			} else {
				if (effectiveTime.getValue() != null) {
					value = effectiveTime.getValue();
				} else {
					if (effectiveTime.getLow() != null) {
						if (effectiveTime.getLow().isSetNullFlavor()) {
							nullFlavorLow = effectiveTime.getLow().getNullFlavor().getLiteral();
						} else {
							low = effectiveTime.getLow().getValue();
						}
					}
					if (effectiveTime.getHigh() != null) {
						if (effectiveTime.getHigh().isSetNullFlavor()) {
							nullFlavorHigh = effectiveTime.getHigh().getNullFlavor().getLiteral();
						} else {
							high = effectiveTime.getHigh().getValue();
						}
					}
				}
			}
		}
		
		String key_value = propKeyTarget;
		String key_high = propKeyTarget + TS_HIGH;
		String key_low = propKeyTarget + TS_LOW;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		String key_nullFlavorHigh = propKeyTarget + TS_HIGH + NULL_FLAVOR;
		String key_nullFlavorLow = propKeyTarget + TS_LOW + NULL_FLAVOR; 

		setProperty(prop, counter > 0 ? key_value + counter : key_value, value, showAll);
		setProperty(prop, counter > 0 ? key_high + counter : key_high, high, showAll);
		setProperty(prop, counter > 0 ? key_low + counter : key_low, low, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavor + counter : key_nullFlavor, nullFlavor, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavorHigh + counter : key_nullFlavorHigh, nullFlavorHigh, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavorLow + counter : key_nullFlavorLow, nullFlavorLow, showAll);
	}
	
	
	public static ED getPropertyED(Properties prop, String propKeyTarget, boolean isRequired) {
		
		ED ed = null;
		String string = prop.getProperty(propKeyTarget, "");
		String nullFlavor = prop.getProperty(propKeyTarget + NULL_FLAVOR, "");
		
		if (nullFlavor != null && nullFlavor.length() > 0) {
			NullFlavor nf = NullFlavor.getByName(nullFlavor);
			if (nf != null) {
				ed = Datatypes.createED();
				ed.setNullFlavor(nf);
			} else {
				//TODO: log nullFlavor type error
			}
		} else {
			if (string != null && string.length() > 0) {
				ed = Datatypes.createED(string);
			}
		}
		if (ed == null && isRequired) {
			ed = Datatypes.createED();
			ed.setNullFlavor(UNK);
		}
		return ed;		
	}
	
	public static void setPropertyED(Properties prop, String propKeyTarget, ED text, boolean showAll) {
		
		setPropertyED(prop, propKeyTarget, text, 0, showAll);
	}
	
	
	public static void setPropertyED(Properties prop, String propKeyTarget, ED text, int counter, boolean showAll) {
		
		String ed = "";
		String nullFlavor = null;
		
		if (text != null) {
			if (text.isSetNullFlavor()) {
				nullFlavor = text.getNullFlavor().getLiteral();
			} else {
				if (text.getMixed() != null) {
					FeatureMap textFeatureMap = text.getMixed();
					for (int i=0; i < textFeatureMap.size(); i++) {
						// TODO: this causes "nullName" bug
						ed = ed + (String) textFeatureMap.getValue(i);
					}
				}
			}
		}
		
		String key_text = propKeyTarget;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		setProperty(prop, counter > 0 ? key_text + counter : key_text, ed, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavor + counter : key_nullFlavor, nullFlavor, showAll);
	}
	
	
	public static IVL_PQ getPropertyIVL_PQ(Properties prop, String propKeyTarget, boolean isRequired) {
		
		IVL_PQ pq = null;
		String pqUnit = prop.getProperty(propKeyTarget + PQ_UNIT, "");
		String pqValue = prop.getProperty(propKeyTarget, "");
		String nullFlavor = prop.getProperty(propKeyTarget + NULL_FLAVOR, "");
		
		if (nullFlavor != null && nullFlavor.length() > 0) {
			NullFlavor nf = NullFlavor.getByName(nullFlavor);
			if (nf != null) {
				pq = Datatypes.createIVL_PQ();
				pq.setNullFlavor(nf);
			} else {
				//TODO: log nullFlavor type error
			}
		} else {
			if (pqValue != null && pqValue.length() > 0) {
				pq = Datatypes.createIVL_PQ();
				try {
					Double value = Double.parseDouble(pqValue);
					pq.setValue(value);
				} catch (NumberFormatException e) {
					// TODO: log exception
				}
			}
			if (pqUnit != null && pqUnit.length() > 0) {
				if (pq == null) {
					pq = Datatypes.createIVL_PQ();
				}
				pq.setUnit(pqUnit);
			}
		}
		if (pq == null && isRequired) {
			pq = Datatypes.createIVL_PQ();
			pq.setNullFlavor(UNK);
		}
		return pq;
	}
	
	public static void setPropertyIVL_PQ(Properties prop, String propKeyTarget, IVL_PQ pq, boolean showAll) {
		//TODO
		
	}
	
	
	public static CS getPropertyCS(Properties prop, String propKeyTarget, boolean isRequired) {
		
		CS cs = null;
		String code = prop.getProperty(propKeyTarget, "");
		String nullFlavor = prop.getProperty(propKeyTarget + NULL_FLAVOR, "");
		
		if (nullFlavor != null && nullFlavor.length() > 0) {
			NullFlavor nf = NullFlavor.getByName(nullFlavor);
			if (nf != null) {
				cs = Datatypes.createCS();
				cs.setNullFlavor(nf);
			} else {
				//TODO: log nullFlavor type error
			}
		} else {
			if (code != null && code.length() > 0) {
				cs = Datatypes.createCS(code);
			}
		}
		if (cs == null && isRequired) {
			cs = Datatypes.createCS();
			cs.setNullFlavor(UNK);
		}
		return cs;
	}
	
	public static void setPropertyCS(Properties prop, String propKeyTarget, CS statusCode, boolean showAll) {
		setPropertyCS(prop, propKeyTarget, statusCode, 0, showAll);
	}
	
	public static void setPropertyCS(Properties prop, String propKeyTarget, CS statusCode, int counter, boolean showAll) {
		
		String code = null;
		String nullFlavor = null;
			
		if (statusCode != null) {
			if (statusCode.isSetNullFlavor()) {
				nullFlavor = statusCode.getNullFlavor().getLiteral();
			} else {
				code = statusCode.getCode();
			}
		}
		
		String key_code = propKeyTarget;
		String key_nullFlavor = propKeyTarget + NULL_FLAVOR;
		
		setProperty(prop, counter > 0 ? key_code + counter: key_code, code, showAll);
		setProperty(prop, counter > 0 ? key_nullFlavor + counter : key_nullFlavor, nullFlavor, showAll);
	}
	
	
	
	public static ANY getPropertyVALUES(Properties prop, String propKeyTarget, boolean isRequired) {
		
		
		// TODO
		return Datatypes.createAD();
		
		
	}
	
	public static void setPropertyVALUES(Properties prop, String propKeyTarget, List<ANY> list, boolean showAll) {
		setPropertyVALUES(prop, propKeyTarget, list, 0, showAll);
	}

	
	public static void setPropertyVALUES(Properties prop, String propKeyTarget, List<ANY> list, int counter, boolean showAll) {
		
		// TODO: assumes list is size one
		
		for (int i=0; i < list.size(); i++) {
			if (list.get(i) instanceof TS) {
				//prop.setProperty(propKeyTarget + ANY_TYPE, "TS");
				setPropertyTS(prop, propKeyTarget, (TS) list.get(i), counter, showAll);
			} else if (list.get(i) instanceof CE) {
				//prop.setProperty(propKeyTarget + ANY_TYPE, "CE");
				setPropertyCE(prop, propKeyTarget, (CE) list.get(i), counter, showAll);
			} else if (list.get(i) instanceof CD) {
				//prop.setProperty(propKeyTarget + ANY_TYPE, "CD");
				setPropertyCD(prop, propKeyTarget, (CD) list.get(i), counter, showAll);
			} else if (list.get(i) instanceof ED) {
				//prop.setProperty(propKeyTarget + ANY_TYPE, "ED");
				setPropertyED(prop, propKeyTarget, (ED) list.get(i), counter, showAll);
			} else {
				System.out.println("getPropertyVALUES type not yet implemented");
			}
		}	
	}
	
	
	public static void setProperty(Properties prop, String propKeyTarget, String value, boolean showAll) {
		
		if (value != null && value.length() > 0) {
			prop.setProperty(propKeyTarget, value);
		} else if (showAll) {
			prop.setProperty(propKeyTarget, "");
		}
	}
	
	
}
