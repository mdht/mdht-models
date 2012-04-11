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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.SpecimenRole;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssignedEntity;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class PhcrUtil {
	
	private static DatatypesFactory Datatypes = DatatypesFactory.eINSTANCE;
	private static CDAFactory CDA = CDAFactory.eINSTANCE;
	private static CCDFactory CCD = CCDFactory.eINSTANCE;
	private static PhcrFactory PHCR = PhcrFactory.eINSTANCE;
	
	public static final String NEWLINE = System.getProperty("line.separator");
	public static final String INDENT = "            ";
	public static final String LIST_OPEN = "<list>" + NEWLINE;
	public static final String LIST_CLOSE = "</list>";
	public static final String ITEM_OPEN = "<item>";
	public static final String ITEM_CLOSE = "</item>" + NEWLINE;
	
	public static final String CAPTION_OPEN = "<caption>";
	public static final String CAPTION_CLOSE = "</caption>";
	
	public static final String TABLE_OPEN = "<table>" + NEWLINE;
	public static final String TABLE_CLOSE = "</table>";
	
	public static final String TABLE_HEAD_OPEN = "<thead>" + NEWLINE;
	public static final String TABLE_HEAD_CLOSE = "</thead>";
	public static final String TABLE_HEAD_CELL_OPEN = "<th>";
	public static final String TABLE_HEAD_CELL_CLOSE = "</th>";
	
	public static final String TABLE_BODY_OPEN = "<tbody>";
	public static final String TABLE_BODY_CLOSE = "</tbody>";
	public static final String TABLE_ROW_OPEN = "<tr>";
	public static final String TABLE_ROW_CLOSE = "</tr>";
	public static final String TABLE_CELL_OPEN = "<td>";
	public static final String TABLE_CELL_CLOSE = "</td>";
	public static final String TABLE_CELL_EMPTY = "<td/>";
	
	public static final String BREAK = "<br/>" + NEWLINE;
	
	/**
	 * PHCR Social History - Race Observation
	 * 
	 * @param socialHistorySection
	 * @param CD raceCode
	 * @return RaceObservation
	 * @throws Exception
	 */
	public static RaceObservation addRaceObservation(PhcrSocialHistorySection socialHistorySection, CD raceCode) throws Exception {
		
		RaceObservation raceObservation = PHCR.createRaceObservation().init();
		if (raceCode != null) {
			raceObservation.getValues().add(raceCode);
		}
		if (socialHistorySection != null) {
			socialHistorySection.addObservation(raceObservation);
			((Entry) raceObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		return raceObservation;
	}
	
	/**
	 * PHCR Social History - Pregnancy Observation
	 * 
	 * @param socialHistorySection
	 * @param IVL_TS estimatedDateOfDelivery
	 * @return PregnancyObservation
	 * @throws Exception
	 */
	public static PregnancyObservation addPregnancyObservation(PhcrSocialHistorySection socialHistorySection, IVL_TS estimatedDateOfDelivery) throws Exception {
		
		PregnancyObservation pregnancyObservation = PHCR.createPregnancyObservation().init();
		EstimatedDateOfDeliveryObservation dateOfDeliveryObservation = PHCR.createEstimatedDateOfDeliveryObservation().init();
		if (estimatedDateOfDelivery != null) {
			pregnancyObservation.addObservation(dateOfDeliveryObservation);
			((EntryRelationship) dateOfDeliveryObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);
			dateOfDeliveryObservation.setEffectiveTime(estimatedDateOfDelivery);
		}
		if (socialHistorySection != null) {
			socialHistorySection.addObservation(pregnancyObservation);
			((Entry) pregnancyObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		return pregnancyObservation;
	}
	
	/**
	 * PHCR Social History - Occupation Observation
	 * 
	 * @param socialHistorySection
	 * @param CD occupationCode
	 * @param boolean addNegation
	 * @param ED occupationText
	 * @param IVL_TS effectiveTime
	 * @return OccupationObservation
	 * @throws Exception
	 */
	public static OccupationObservation addOccupationObservation(PhcrSocialHistorySection socialHistorySection, CD occupationCode, boolean addNegation, ED occupationText, IVL_TS effectiveTime) throws Exception {
		
		OccupationObservation occupationObservation = PHCR.createOccupationObservation().init();
		if (occupationCode != null) {
			occupationObservation.getValues().add(occupationCode);
		}
		if (addNegation) {
			occupationObservation.setNegationInd(true);
		}
		if (occupationText != null) {
			occupationObservation.setText(occupationText);
		}
		if (effectiveTime != null) {
			occupationObservation.setEffectiveTime(effectiveTime);
		}
		if (socialHistorySection != null) {
			socialHistorySection.addObservation(occupationObservation);
			((Entry) occupationObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		return occupationObservation;
	}
	
	/**
	 * PHCR Social History - Geotemporal History
	 * 
	 * @param socialHistorySection
	 * @param IVL_TS effectiveTime
	 * @param CD value
	 * @return
	 * @throws Exception
	 */
	public static GeotemporalHistoryObservation addGeotemporalHistoryObservation(PhcrSocialHistorySection socialHistorySection, IVL_TS effectiveTime, CD value) throws Exception {
		
		GeotemporalHistoryObservation geotemporalHistoryObservation = PHCR.createGeotemporalHistoryObservation().init();
		if (effectiveTime != null) {
			geotemporalHistoryObservation.setEffectiveTime(effectiveTime);
		}
		if (value != null) {
			geotemporalHistoryObservation.getValues().add(value);
		}
		if (socialHistorySection != null) {
			socialHistorySection.addObservation(geotemporalHistoryObservation);
			((Entry) geotemporalHistoryObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		return geotemporalHistoryObservation;
	}
	
	/**
	 * PHCR Social History - MostRecentTimeInUSAObservation
	 * @throws Exception
	 */
	public static MostRecentTimeArrivedInUSAObservation addMostRecentTimeArrivedInUSAObservation(PhcrSocialHistorySection socialHistorySection, TS mostRecentTime) throws Exception {
		
		MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation = PHCR.createMostRecentTimeArrivedInUSAObservation().init();
		if (mostRecentTime != null) {
			mostRecentTimeArrivedInUSAObservation.getValues().add(mostRecentTime);
		}
		if (socialHistorySection != null) {
			socialHistorySection.addObservation(mostRecentTimeArrivedInUSAObservation);
			((Entry) mostRecentTimeArrivedInUSAObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		return mostRecentTimeArrivedInUSAObservation;
	}
	
	
	/**
	 * PHCR Clinical Information - CaseObservation: Problem Status Observation, Signs and Symptoms Observation(s)
	 * @param clinicalInformationSection
	 * @param condition
	 * @return CaseObservation
	 * @throws Exception
	 */
	public static CaseObservation addCaseObservation(PhcrClinicalInformationSection clinicalInformationSection, CD condition) throws Exception {
		
		CaseObservation caseObservation = PHCR.createCaseObservation().init();
		if (condition != null) {
			caseObservation.getValues().add(condition);
		}
		if (clinicalInformationSection != null) {
			clinicalInformationSection.addObservation(caseObservation);
			((Entry) caseObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		return caseObservation;
	}
	
	
	public static ProblemStatusObservation addProblemStatusObservation(CaseObservation caseObservation, CE statusCode) throws Exception {
		
		ProblemStatusObservation statusObservation = CCD.createProblemStatusObservation().init();
		if (statusCode != null) {
			statusObservation.getValues().add(statusCode);
		}
		if (caseObservation != null) {
			caseObservation.addObservation(statusObservation);
			((EntryRelationship) statusObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);
		}
		return statusObservation;
	}
	
	
	public static SignsAndSymptomsObservation addSignsAndSymptomsObservation(CaseObservation caseObservation, IVL_TS effectiveTime, CD signSymptomCD, boolean signSymptomNegation) throws Exception {
		
		SignsAndSymptomsObservation symptomsObservation = PHCR.createSignsAndSymptomsObservation().init();
		if (effectiveTime != null) {
			symptomsObservation.setEffectiveTime(effectiveTime);
		}
		if (signSymptomCD != null) {
			symptomsObservation.getValues().add(signSymptomCD);
		}
		if (signSymptomNegation) {
			symptomsObservation.setNegationInd(signSymptomNegation);
		}
		if (caseObservation != null) {
			caseObservation.addObservation(symptomsObservation);
			((EntryRelationship) symptomsObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.MFST);
			((EntryRelationship) symptomsObservation.eContainer()).setInversionInd(true);
		}
		return symptomsObservation;
	}
	
	
	/**
	 * PHCR Clinical Information - Patient Condition Alive
	 * @param clinicalInformationSection
	 * @param effectiveTime
	 * @return PatientConditionAliveObservation
	 * @throws Exception
	 */
	public static PatientConditionAliveObservation addPatientConditionAlive(PhcrClinicalInformationSection clinicalInformationSection, IVL_TS effectiveTime) throws Exception {
		
		PatientConditionAliveObservation aliveObservation = PHCR.createPatientConditionAliveObservation().init();
		if (effectiveTime != null) {
			aliveObservation.setEffectiveTime(effectiveTime);
		}
		CD aliveValueCode = Datatypes.createCD("438949009", "2.16.840.1.113883.6.96", "SNOMEDCT", "Alive");
		aliveObservation.getValues().add(aliveValueCode);
		if (clinicalInformationSection != null) {
			clinicalInformationSection.addObservation(aliveObservation);
			((Entry) aliveObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		return aliveObservation;
	}

	
	/**
	 * PHCR Clinical Information - Patient Condition Deceased
	 * @param clinicalInformationSection
	 * @param caseObservationId
	 * @param timeOfDeath
	 * @param causeIsReportable
	 * @param causeOfDeath
	 * @throws Exception
	 */
	public static PatientConditionDeceasedObservation addPatientConditionDeceased(PhcrClinicalInformationSection clinicalInformationSection, II caseObservationId, IVL_TS timeOfDeath, boolean causeIsReportable, CD causeOfDeath) throws Exception {
		
		PatientConditionDeceasedObservation deceasedObservation = PHCR.createPatientConditionDeceasedObservation().init();
		CD deceasedValueCode = Datatypes.createCD("419099009", "2.16.840.1.113883.6.96", "SNOMEDCT", "Dead");
		deceasedObservation.getValues().add(deceasedValueCode);
//		PatientConditionDeceasedCauseObservation causeObservation = PHCR.createPatientConditionDeceasedCauseObservation().init();
//		deceasedObservation.addObservation(causeObservation);
//		if (caseObservationId != null) {
//			causeObservation.getIds().add(caseObservationId);
//		}
//		if (timeOfDeath != null) {
//			causeObservation.setEffectiveTime(timeOfDeath);
//		}
//		if (causeOfDeath != null) {
//			causeObservation.getValues().add(causeOfDeath);
//		}
		
		if (clinicalInformationSection != null) {
			clinicalInformationSection.addObservation(deceasedObservation);
			((Entry) deceasedObservation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
//			((EntryRelationship) causeObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.CAUS);
//			if (causeIsReportable) {
//				((EntryRelationship) causeObservation.eContainer()).setNegationInd(causeIsReportable);
//			}
		}
		return deceasedObservation;
	}
	
	
	
	public static TherapeuticRegimenAct addTherapeuticRegimenAct(PhcrTreatmentInformationSection treatmentInformationSection, List<II> caseIdList, CD caseCode) throws Exception {
		
		TherapeuticRegimenAct regimenAct = PHCR.createTherapeuticRegimenAct().init();
//		TherapeuticRegimenActObservation actObservation = PHCR.createTherapeuticRegimenActObservation().init();
//		regimenAct.addObservation(actObservation);
//		((EntryRelationship) actObservation.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);	
		
//		for (int i=0; i < caseIdList.size(); i++) {
//			actObservation.getIds().add(caseIdList.get(i));
//		}
//		if (caseCode != null) {
//			actObservation.getValues().add(caseCode);
//		}
		
		if (treatmentInformationSection != null) {
			treatmentInformationSection.addAct(regimenAct);
			((Entry) regimenAct.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		return regimenAct;
	}
	
	
	public static TreatmentGivenSubstanceAdministration addTreatmentGiven(TherapeuticRegimenAct regimenAct, CS subsAdminStatus,
			IVL_TS subsAdminTime, CE routeCode, IVL_PQ rate, IVL_PQ dose, CE materialCode, EN materialName) throws Exception {
		
		TreatmentGivenSubstanceAdministration treatmentGivenSBADM = PHCR.createTreatmentGivenSubstanceAdministration().init();
				
		Consumable consumable = CDA.createConsumable();
		ManufacturedProduct product = CDA.createManufacturedProduct();
		Material material = CDA.createMaterial();
		product.setManufacturedMaterial(material);
		consumable.setManufacturedProduct(product);
		treatmentGivenSBADM.setConsumable(consumable);
		
		if (subsAdminStatus != null) treatmentGivenSBADM.setStatusCode(subsAdminStatus);
		if (subsAdminTime != null) treatmentGivenSBADM.getEffectiveTimes().add(subsAdminTime);
		if (routeCode != null) treatmentGivenSBADM.setRouteCode(routeCode);
		if (rate != null) treatmentGivenSBADM.setRateQuantity(rate);
		if (dose != null) treatmentGivenSBADM.setDoseQuantity(dose);
		if (materialCode != null) material.setCode(materialCode);
		if (materialName != null) material.setName(materialName);
		
		if (regimenAct != null) {
			regimenAct.addSubstanceAdministration(treatmentGivenSBADM);
			((EntryRelationship) treatmentGivenSBADM.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
		}
		return treatmentGivenSBADM;
	}
	
	
	public static TreatmentNotGivenSubstanceAdministration addTreatmentNotGiven(TherapeuticRegimenAct regimenAct, CS subsAdminStatus,
			IVL_TS subsAdminTime, CE routeCode, IVL_PQ rate, IVL_PQ dose, CE materialCode, EN materialName) throws Exception {
		
		TreatmentNotGivenSubstanceAdministration treatmentNotGivenSBADM = PHCR.createTreatmentNotGivenSubstanceAdministration().init();
				
		Consumable consumable = CDA.createConsumable();
		ManufacturedProduct product = CDA.createManufacturedProduct();
		Material material = CDA.createMaterial();
		product.setManufacturedMaterial(material);
		consumable.setManufacturedProduct(product);
		treatmentNotGivenSBADM.setConsumable(consumable);
		
		if (subsAdminStatus != null) treatmentNotGivenSBADM.setStatusCode(subsAdminStatus);
		if (subsAdminTime != null) treatmentNotGivenSBADM.getEffectiveTimes().add(subsAdminTime);
		if (routeCode != null) treatmentNotGivenSBADM.setRouteCode(routeCode);
		if (rate != null) treatmentNotGivenSBADM.setRateQuantity(rate);
		if (dose != null) treatmentNotGivenSBADM.setDoseQuantity(dose);
		if (materialCode != null) material.setCode(materialCode);
		if (materialName != null) material.setName(materialName);
		
		if (regimenAct != null) {
			regimenAct.addSubstanceAdministration(treatmentNotGivenSBADM);
			((EntryRelationship) treatmentNotGivenSBADM.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.COMP);
		}
		return treatmentNotGivenSBADM;
	}
	
	
	public static ResultOrganizer addLabResultOrganizer(PhcrRelevantDxTestsSection dxTestsSection, List<II> idList, CD code, IVL_TS effectiveTime, CE specimenType) throws Exception {
		
		ResultOrganizer organizer = PHCR.createResultOrganizer().init();
		
		for (int i=0; i < idList.size(); i++) {
			organizer.getIds().add(idList.get(i));
		}
		if (code != null) organizer.setCode(code);
		if (effectiveTime != null) organizer.setEffectiveTime(effectiveTime);
		
		if (specimenType != null) {
			Specimen specimen = CDA.createSpecimen();
			SpecimenRole specimenRole = CDA.createSpecimenRole();
			PlayingEntity playingEntity = CDA.createPlayingEntity();
			specimenRole.setSpecimenPlayingEntity(playingEntity);
			specimen.setSpecimenRole(specimenRole);
			organizer.getSpecimens().add(specimen);
			playingEntity.setCode(specimenType);
		}
		
		if (dxTestsSection != null) {
			dxTestsSection.addOrganizer(organizer);
			((Entry) organizer.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		
		return organizer;
	}
	
	public static ResultObservation addLabResultObservation(ResultOrganizer organizer, List<II> idList, CD code, IVL_TS effectiveTime, ANY value) throws Exception {
		
		ResultObservation observation = PHCR.createResultObservation().init();
		
		for (int i=0; i < idList.size(); i++) {
			observation.getIds().add(idList.get(i));
		}
		if (code != null) observation.setCode(code);
		if (effectiveTime != null) observation.setEffectiveTime(effectiveTime);
		if (value != null) observation.getValues().add(value);
		
		if (organizer != null) {
			organizer.addObservation(observation);
		}
		
		return observation;
	}
	
	
	public static ResultObservation addLabResultObservation(PhcrRelevantDxTestsSection dxTestsSection, List<II> idList, CD code, IVL_TS effectiveTime, ANY value, CE specimenType) throws Exception {
		
		ResultObservation observation = PHCR.createResultObservation().init();
		
		for (int i=0; i < idList.size(); i++) {
			observation.getIds().add(idList.get(i));
		}
		if (code != null) observation.setCode(code);
		if (effectiveTime != null) observation.setEffectiveTime(effectiveTime);
		if (value != null) observation.getValues().add(value);
		
		if (specimenType != null) {
			Specimen specimen = CDA.createSpecimen();
			SpecimenRole specimenRole = CDA.createSpecimenRole();
			PlayingEntity playingEntity = CDA.createPlayingEntity();
			specimenRole.setSpecimenPlayingEntity(playingEntity);
			specimen.setSpecimenRole(specimenRole);
			observation.getSpecimens().add(specimen);
			playingEntity.setCode(specimenType);
		}
		
		if (dxTestsSection != null) {
			dxTestsSection.addObservation(observation);
			((Entry) observation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		
		return observation;		
	}
	
	
	public static ImagingObservation addImagingObservation(PhcrRelevantDxTestsSection dxTestsSection, List<II> idList, CD code, IVL_TS effectiveTime, ANY value, CE methodType) throws Exception {
		
		ImagingObservation observation = PHCR.createImagingObservation().init();
		
		for (int i=0; i < idList.size(); i++) {
			observation.getIds().add(idList.get(i));
		}
		if (code != null) observation.setCode(code);
		if (effectiveTime != null) observation.setEffectiveTime(effectiveTime);
		if (value != null) observation.getValues().add(value);
		if (methodType != null) observation.getMethodCodes().add(methodType);
		
		if (dxTestsSection != null) {
			dxTestsSection.addObservation(observation);
			((Entry) observation.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		return observation;
	}
	
	
	
	/**
	 * CCD Encounters
	 * @param encountersSection
	 * @param id
	 * @param actEncounterCode
	 * @param effectiveTime
	 * @return
	 * @throws Exception
	 */
	public static EncountersActivity addCCDEncounterActivity(PhcrEncountersSection encountersSection, List<II> idList, IVL_TS effectiveTime, CD actEncounterCode) throws Exception {
		
		EncountersActivity encountersActivity = CCD.createEncountersActivity().init();
		if (encountersSection != null) {
			encountersSection.addEncounter(encountersActivity);
			((Entry) encountersActivity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		for (int i=0; i < idList.size(); i++) {
			encountersActivity.getIds().add(idList.get(i));
		}
		if (effectiveTime != null) {
			encountersActivity.setEffectiveTime(effectiveTime);
		}
		if (actEncounterCode != null) {
			encountersActivity.setCode(actEncounterCode);
		}
		return encountersActivity;
	}
	
	
	public static Performer2 addEncounterPerformer(EncountersActivity activity, List<II> idList, List<AD> adList, List<TEL>telList, List<PN> nameList) throws Exception {
		
		Performer2 encounterPerformer = CDA.createPerformer2();
		encounterPerformer.setTypeCode(ParticipationPhysicalPerformer.PRF);
		AssignedEntity entity = CDA.createAssignedEntity();
		entity.setClassCode(RoleClassAssignedEntity.ASSIGNED);
		encounterPerformer.setAssignedEntity(entity);
		
		for (int k=0; k < idList.size(); k++) {
			entity.getIds().add(idList.get(k));
		}
		for (int k=0; k < adList.size(); k++) {
			entity.getAddrs().add(adList.get(k));
		}
		for (int k=0; k < telList.size(); k++) {
			entity.getTelecoms().add(telList.get(k));
		}
		Person person = CDA.createPerson();
		if (nameList.size() > 0) {
			entity.setAssignedPerson(person);
			for (int k=0; k < nameList.size(); k++) {
				person.getNames().add(nameList.get(k));
			}
		}
				
		if (activity != null) {
			activity.getPerformers().add(encounterPerformer);
		}
		return encounterPerformer;
	}
	
	
	public static Participant2 addEncounterParticipant(EncountersActivity activity, List<II> idList, List<AD> adList, List<TEL>telList, List<PN> nameList) throws Exception {
		
		Participant2 encounterParticipant = CDA.createParticipant2();
		encounterParticipant.setTypeCode(ParticipationType.LOC);
		ParticipantRole role = CDA.createParticipantRole();
		role.setClassCode(RoleClassRoot.SDLOC);
		encounterParticipant.setParticipantRole(role);
		
		for (int k=0; k < idList.size(); k++) {
			role.getIds().add(idList.get(k));
		}
		for (int k=0; k < adList.size(); k++) {
			role.getAddrs().add(adList.get(k));
		}
		for (int k=0; k < telList.size(); k++) {
			role.getTelecoms().add(telList.get(k));
		}
		PlayingEntity entity = CDA.createPlayingEntity();
		entity.setClassCode(EntityClassRoot.PLC);
		if (nameList.size() > 0) {
			role.setPlayingEntity(entity);
			for (int k=0; k < nameList.size(); k++) {
				entity.getNames().add(nameList.get(k));
			}
		}
		
		if (activity != null) {
			activity.getParticipants().add(encounterParticipant);
		}
		return encounterParticipant;
	}
	
	


	public static MedicationActivity addCCDMedicationActivity(ImmunizationsSection immunizationsSection, List<II> activityId, CS subsAdminStatus,
			IVL_TS subsAdminTime, CE routeCode, IVL_PQ dose, CE materialCode, EN materialName) throws Exception {
		
		MedicationActivity medicationActivity = CCD.createMedicationActivity().init();
		
		Consumable consumable = CDA.createConsumable();
		ManufacturedProduct product = CDA.createManufacturedProduct();
		Material material = CDA.createMaterial();
		product.setManufacturedMaterial(material);
		consumable.setManufacturedProduct(product);
		medicationActivity.setConsumable(consumable);
		
		for (int i=0; i < activityId.size(); i++) {
			medicationActivity.getIds().add(activityId.get(i));
		}
		if (subsAdminStatus != null) medicationActivity.setStatusCode(subsAdminStatus);
		if (subsAdminTime != null) medicationActivity.getEffectiveTimes().add(subsAdminTime);
		if (routeCode != null) medicationActivity.setRouteCode(routeCode);
		if (dose != null) medicationActivity.setDoseQuantity(dose);
		if (materialCode != null) material.setCode(materialCode);
		if (materialName != null) material.setName(materialName);
		
		if (immunizationsSection != null) {
			immunizationsSection.setTitle(Datatypes.createST("Immunizations"));
			immunizationsSection.addSubstanceAdministration(medicationActivity);
			((Entry) medicationActivity.eContainer()).setTypeCode(x_ActRelationshipEntry.DRIV);
		}
		return medicationActivity;
	}
	
	public static List<String> immunizationsSectionCreateStrucDocTextItems(ImmunizationsSection immunizationsSection) throws Exception {
		
		List<String> items = new ArrayList<String>();
		
		List<MedicationActivity> activitiesList = immunizationsSection.getMedicationActivities();
		if (activitiesList.size() < 1) {
			items.add("MedicationActivities not included.");
		}
		for (int i=0; i < activitiesList.size(); i++) {
			//StringBuffer buffer = new StringBuffer();
			String materialName = null;
			String adminStatus = null;
			String adminTime = null;
			MedicationActivity med = activitiesList.get(i);
			if (med != null) {
				Consumable medConsumable = med.getConsumable();
				if (medConsumable != null) {
					ManufacturedProduct product = medConsumable.getManufacturedProduct();
					if (product != null) {
						Material medMaterial = product.getManufacturedMaterial();
						if (medMaterial != null) {
							EN materialEName = medMaterial.getName();
							if (materialEName != null) {
								materialName = materialEName.getText();
							}
						}
					}
				}
				adminStatus = med.getStatusCode().getCode();
				if (med.getEffectiveTimes().size() < 1) {
					items.add(materialName + " " + adminStatus);
				}
				for (int j=0; j < med.getEffectiveTimes().size(); j++) {
					adminTime = displayIVL_TS((IVL_TS) med.getEffectiveTimes().get(j), 1);
					items.add(materialName + " " + adminStatus + " on " + adminTime);
				}
			}
		}
		
		return items;
	}
	
	
	/**
	 * 
	 * Format 0 - Code
	 * Format 1 - DisplayName
	 * Format 2 - DisplayName (Code^CodeSystemName)
	 * 
	 * @param code
	 * @param format
	 * @return
	 * @throws Exception
	 */
	public static String displayCD(CD code, int format) throws Exception {
		
		StringBuffer buffer = new StringBuffer();
		
		switch(format) {
		case 0:
			if (!code.isSetNullFlavor()) {
				if ((code != null) && (code.getCode() != null) && (code.getCode().length() > 0)) {
					buffer.append(code.getCode());
				}
			} else {
				buffer.append(code.getNullFlavor().getName());
			}
			break;
		case 1:
			if (!code.isSetNullFlavor()) {
				if ((code != null) && (code.getDisplayName() != null) && (code.getDisplayName().length() > 0)) {
					buffer.append(code.getDisplayName());
				}
			} else {
				buffer.append(code.getNullFlavor().getName());
			}
			break;
		case 2:
		default:
			if (code != null) {
				if (!code.isSetNullFlavor()) {
					if (code.getDisplayName() != null) {
						buffer.append(code.getDisplayName());
						if (code.getCode() != null) {
							buffer.append(" (" + code.getCode());
							if (code.getCodeSystemName() != null) {
								buffer.append("^" + code.getCodeSystemName());
							}
							buffer.append(")");
						}
					} else if (code.getCode() != null) {
						buffer.append(code.getCode());
						if (code.getCodeSystemName() != null) {
							buffer.append("^" + code.getCodeSystemName());
						}
					}
				} else {
					buffer.append(code.getNullFlavor().getName());
				}
			}
		}
		
		return buffer.toString();
	}
	
	
	// 0 - "MMM d, yyyy HH:mm:ss z"
	// 1 - "yyyy/MM/dd"
	
	public static String displayIVL_TS(IVL_TS effectiveTime, int format) throws Exception {
		
		String dateFormat = "MMM d, yyyy HH:mm:ss z";
		if (format == 1) {
			dateFormat = "yyyy/MM/dd";
		}
		
		
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
		
		String displayString = null;
		if (nullFlavor != null) {
			displayString = nullFlavor;
		} else if (value != null) {
			displayString = timeStampFormat(value, dateFormat);
		} else if (low != null) {
			displayString = timeStampFormat(low, dateFormat) + " - ";
			if (high != null) {
				displayString = displayString + timeStampFormat(high, dateFormat);
			} else if (nullFlavorHigh != null) {
				displayString = displayString + nullFlavorHigh;
			} else {
				displayString = displayString + "()";
			}
		} else if (high != null) {
			if (nullFlavorLow != null) {
				displayString = nullFlavorLow + " - " + timeStampFormat(high, dateFormat);
			} else {
				displayString = "() - " + timeStampFormat(high, dateFormat);
			}
		} else if (nullFlavorLow != null) {
			if (nullFlavorHigh != null) {
				displayString = nullFlavorLow + " - " + nullFlavorHigh;
			} else {
				displayString = nullFlavorLow + " - ()";
			}
		} else if (nullFlavorHigh != null) {
			displayString = "() - " + nullFlavorHigh;
		}
		
		return displayString;
	}
	
	
	public static String displayTS(TS effectiveTime, int format) throws Exception {
		
		String dateFormat = "MMM d, yyyy HH:mm:ss z";
		if (format == 1) {
			dateFormat = "yyyy/MM/dd";
		}
		
		String value = null;
		String nullFlavor = null;
		String displayString = null;
		
		if (effectiveTime != null) {
			if (effectiveTime.isSetNullFlavor()) {
				nullFlavor = effectiveTime.getNullFlavor().getLiteral();
			} else {
				if (effectiveTime.getValue() != null) {
					value = effectiveTime.getValue();
				}
			}
		}
		
		if (nullFlavor != null) {
			displayString = nullFlavor;
		} else if (value != null) {
			displayString = timeStampFormat(value, dateFormat);
		}
		return displayString;
	}
	
	
	private static String timeStampFormat(String stringDate, String format) throws Exception {
		
		Date date;
		SimpleDateFormat cdaDateFormat = new SimpleDateFormat("yyyyMMddHHmmssZ");
		date = cdaDateFormat.parse(stringDate);
		SimpleDateFormat newDateFormat = new SimpleDateFormat(format);
		return newDateFormat.format(date);
	}
	
	
	
	
	/**
	 * Re-usable Organizer Text Table Open Logic
	 * @param title - list caption
	 * @param includeTableHeader - boolean
	 * @return strucDocText string
	 */
	public static String createStrucDocTextListOpen(String title) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(LIST_OPEN);
		buffer.append(INDENT + CAPTION_OPEN + title + CAPTION_CLOSE);
		buffer.append(LIST_CLOSE + NEWLINE);
		
		buffer.append(INDENT + LIST_OPEN);
		
		return buffer.toString();
	}
	
	public static String createStrucDocTextListItems(List<String> items) {
		StringBuffer buffer = new StringBuffer();
		for (int i=0; i < items.size(); i++) {
			buffer.append(INDENT + INDENT + ITEM_OPEN + items.get(i) + ITEM_CLOSE);
		}
		return buffer.toString();
	}
	
	/**
	 * Re-usable Organizer Text Table Close Logic
	 * @return strucDocText string
	 */
	public static String createStrucDocTextListClose() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(INDENT + LIST_CLOSE);		
		return buffer.toString();		
	}
	
	
	
	
	
}
