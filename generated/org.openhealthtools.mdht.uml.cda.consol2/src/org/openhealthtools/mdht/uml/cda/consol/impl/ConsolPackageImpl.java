/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.util.AnnotationBasedInitializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsolPackageImpl extends EPackageImpl implements ConsolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "consol.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalHeaderConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyProblemActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceOrDeviceAllergyObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactionObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass severityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ageObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonMedicinalSupplyActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationSupplyOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drugVehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemConcernActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuityOfCareDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectivesSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergiesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergiesSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encountersSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payersSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityEncounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivityProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivitySubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfCareActivitySupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proceduresSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proceduresSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryDeathObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialHistoryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pregnancyObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estimatedDateOfDeliveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smokingStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tobaccoUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalEquipmentSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalStatusSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalStatusResultOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalStatusResultObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caregiverCharacteristicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentScaleObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentScaleSupportingObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cognitiveStatusResultOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cognitiveStatusResultObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalStatusProblemObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cognitiveStatusProblemObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressureUlcerObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfPressureUlcersObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highestPressureUlcerStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectivesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encountersSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterActivitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDeliveryLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRefusalReasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyOfPastIllnessSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chiefComplaintSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonForReferralSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyOfPresentIllnessSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalAdmissionDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalAdmissionMedicationsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admissionMedicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeMedicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargePhysicalSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chiefComplaintAndReasonForVisitSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonForVisitSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anesthesiaSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dicomObjectCatalogSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seriesActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sopInstanceObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposeofReferenceObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedFramesObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalConsultationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interventionsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operativeNoteFluidSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operativeNoteSurgicalProcedureSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedProcedureSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postoperativeDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postprocedureDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postprocedureDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preoperativeDiagnosisSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureDescriptionSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureDispositionSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEstimatedBloodLossSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureFindingsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureImplantsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureIndicationsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureSpecimensTakenSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectiveSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consultationNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyAndPhysicalNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operativeNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preoperativeDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalAdmissionDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticImagingReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicianReadingStudyPerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicianofRecordParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityMeasurementObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeObservationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationUseNoneKnownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deceasedObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fetusSubjectContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observerContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicsOfHomeEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cognitiveAbilitiesObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass culturalAndReligiousObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drugMonitoringActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handoffCommunicationParticipantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalEquipmentOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mentalStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionRecommendationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionalStatusObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outcomeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientReferralActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedCoverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthConcernActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interventionActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDocumentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedImmunizationActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prognosisObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressTowardGoalObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfCareActivitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensoryStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longitudinalCareWoundObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceAdministeredActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfPressureUlcersObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass woundMeasurementObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass woundCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthConcernsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mentalStatusSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mentalStatusOrganizer2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalFindingsOfSkinSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usRealmHeader2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referralNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usRealmHeaderPatientGeneratedDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorParticipationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admissionMedication2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectiveObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyConcernAct2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mentalStatusObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smokingStatusMeaningfulUse2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageActivity2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deceasedObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeMedication2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterActivity2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterDiagnosis2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalStatusObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalStatusOrganizer2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthStatusObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalAdmissionDiagnosis2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeDiagnosis2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationActivity2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationMedicationInformation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indication2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruction2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationActivity2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispense2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationInformation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationSupplyOrder2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonMedicinalSupplyActivity2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicianofRecordParticipant2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedAct2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedEncounter2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityPreferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedProcedure2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedMedicationActivity2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedSupply2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyActivity2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postprocedureDiagnosis2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preoperativeDiagnosis2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemConcernAct2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityAct2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureActivityProcedure2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactionObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultOrganizer2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass severityObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationFreeTextSigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialHistoryObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceOrDeviceAllergyObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tobaccoUse2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsOrganizer2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anesthesiaSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentAndPlanSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complicationsSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admissionDiagnosisSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admissionMedicationsSectionEntriesOptional2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeMedicationsSectionEntriesOptional2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encountersSectionEntriesOptional2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeDiagnosisSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalStatusSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyOfPastIllnessSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationsSectionEntriesOptional2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionsSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interventionsSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalEquipmentSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsAdministeredSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payersSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalExamSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planOfTreatmentSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedProcedureSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postprocedureDiagnosisSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preoperativeDiagnosisSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureFindingsSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureIndicationsSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeMedicationsSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proceduresSectionEntriesOptional2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonForReferralSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsSectionEntriesOptional2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialHistorySection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsSectionEntriesOptional2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectivesSectionEntriesOptional2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsSectionEntriesOptional2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemSectionEntriesOptional2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectivesSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergiesSectionEntriesOptional2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergiesSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encountersSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationsSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proceduresSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsSection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consultationNote2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuityOfCareDocument2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticImagingReport2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeSummary2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyAndPhysicalNote2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operativeNote2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureNote2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressNote2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredDocument2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preconditionForSubstanceAdministration2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryObservation2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthStatusEvaluationsAndOutcomesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistoryOrganizer2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyHistorySection2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicianReadingStudyPerformer2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseOfCareSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannedInterventionActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskConcernActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsAdministeredSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalExamSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalStatusSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewOfSystemsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalCourseSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentAndPlanSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surgicalDrainsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeDietSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeMedicationsSectionEntriesOptionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preconditionForSubstanceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationMedicationInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeStudiesSummarySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dischargeMedicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalDischargeInstructionsSectionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConsolPackageImpl() {
		super(eNS_URI, ConsolFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConsolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ConsolPackage init() {
		if (isInited) {
			return (ConsolPackage) EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);
		}

		// Obtain or create and register package
		ConsolPackageImpl theConsolPackage = (ConsolPackageImpl) (EPackage.Registry.INSTANCE.get(
			eNS_URI) instanceof ConsolPackageImpl
					? EPackage.Registry.INSTANCE.get(eNS_URI)
					: new ConsolPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CDAPackage.eINSTANCE.eClass();

		// Load packages
		theConsolPackage.loadPackage();

		// Fix loaded packages
		theConsolPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theConsolPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return ConsolValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theConsolPackage.freeze();

		// publish my initializers in the registry
		Initializer.Registry.INSTANCE.registerFactory(
			"org.openhealthtools.mdht.uml.cda.consol", AnnotationBasedInitializer.FACTORY);
		Initializer.Registry.INSTANCE.initializeEPackage(theConsolPackage);

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConsolPackage.eNS_URI, theConsolPackage);
		return theConsolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralHeaderConstraints() {
		if (generalHeaderConstraintsEClass == null) {
			generalHeaderConstraintsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(0);
		}
		return generalHeaderConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllergyProblemAct() {
		if (allergyProblemActEClass == null) {
			allergyProblemActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(1);
		}
		return allergyProblemActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllergyObservation() {
		if (allergyObservationEClass == null) {
			allergyObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(2);
		}
		return allergyObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubstanceOrDeviceAllergyObservation() {
		if (substanceOrDeviceAllergyObservationEClass == null) {
			substanceOrDeviceAllergyObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(3);
		}
		return substanceOrDeviceAllergyObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReactionObservation() {
		if (reactionObservationEClass == null) {
			reactionObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(5);
		}
		return reactionObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeverityObservation() {
		if (severityObservationEClass == null) {
			severityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(6);
		}
		return severityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllergyStatusObservation() {
		if (allergyStatusObservationEClass == null) {
			allergyStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(4);
		}
		return allergyStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgeObservation() {
		if (ageObservationEClass == null) {
			ageObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(16);
		}
		return ageObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthStatusObservation() {
		if (healthStatusObservationEClass == null) {
			healthStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(17);
		}
		return healthStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommentActivity() {
		if (commentActivityEClass == null) {
			commentActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(18);
		}
		return commentActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationActivity() {
		if (medicationActivityEClass == null) {
			medicationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(10);
		}
		return medicationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNonMedicinalSupplyActivity() {
		if (nonMedicinalSupplyActivityEClass == null) {
			nonMedicinalSupplyActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(19);
		}
		return nonMedicinalSupplyActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductInstance() {
		if (productInstanceEClass == null) {
			productInstanceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(15);
		}
		return productInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstructions() {
		if (instructionsEClass == null) {
			instructionsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(12);
		}
		return instructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndication() {
		if (indicationEClass == null) {
			indicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(8);
		}
		return indicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationDispense() {
		if (medicationDispenseEClass == null) {
			medicationDispenseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(13);
		}
		return medicationDispenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationSupplyOrder() {
		if (medicationSupplyOrderEClass == null) {
			medicationSupplyOrderEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(11);
		}
		return medicationSupplyOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDrugVehicle() {
		if (drugVehicleEClass == null) {
			drugVehicleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(14);
		}
		return drugVehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProblemConcernAct() {
		if (problemConcernActEClass == null) {
			problemConcernActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(20);
		}
		return problemConcernActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProblemObservation() {
		if (problemObservationEClass == null) {
			problemObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(21);
		}
		return problemObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProblemStatus() {
		if (problemStatusEClass == null) {
			problemStatusEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(22);
		}
		return problemStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuityOfCareDocument() {
		if (continuityOfCareDocumentEClass == null) {
			continuityOfCareDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(23);
		}
		return continuityOfCareDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdvanceDirectivesSectionEntriesOptional() {
		if (advanceDirectivesSectionEntriesOptionalEClass == null) {
			advanceDirectivesSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(39);
		}
		return advanceDirectivesSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllergiesSection() {
		if (allergiesSectionEClass == null) {
			allergiesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(24);
		}
		return allergiesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllergiesSectionEntriesOptional() {
		if (allergiesSectionEntriesOptionalEClass == null) {
			allergiesSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(25);
		}
		return allergiesSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncountersSectionEntriesOptional() {
		if (encountersSectionEntriesOptionalEClass == null) {
			encountersSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(42);
		}
		return encountersSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmunizationsSectionEntriesOptional() {
		if (immunizationsSectionEntriesOptionalEClass == null) {
			immunizationsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(62);
		}
		return immunizationsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayersSection() {
		if (payersSectionEClass == null) {
			payersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(66);
		}
		return payersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoverageActivity() {
		if (coverageActivityEClass == null) {
			coverageActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(67);
		}
		return coverageActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyActivity() {
		if (policyActivityEClass == null) {
			policyActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(68);
		}
		return policyActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorizationActivity() {
		if (authorizationActivityEClass == null) {
			authorizationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(118);
		}
		return authorizationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationsSection() {
		if (medicationsSectionEClass == null) {
			medicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(26);
		}
		return medicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationsSectionEntriesOptional() {
		if (medicationsSectionEntriesOptionalEClass == null) {
			medicationsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(27);
		}
		return medicationsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanOfCareSection() {
		if (planOfCareSectionEClass == null) {
			planOfCareSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(69);
		}
		return planOfCareSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanOfCareActivityAct() {
		if (planOfCareActivityActEClass == null) {
			planOfCareActivityActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(70);
		}
		return planOfCareActivityActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanOfCareActivityEncounter() {
		if (planOfCareActivityEncounterEClass == null) {
			planOfCareActivityEncounterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(71);
		}
		return planOfCareActivityEncounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanOfCareActivityObservation() {
		if (planOfCareActivityObservationEClass == null) {
			planOfCareActivityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(72);
		}
		return planOfCareActivityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanOfCareActivityProcedure() {
		if (planOfCareActivityProcedureEClass == null) {
			planOfCareActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(73);
		}
		return planOfCareActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanOfCareActivitySubstanceAdministration() {
		if (planOfCareActivitySubstanceAdministrationEClass == null) {
			planOfCareActivitySubstanceAdministrationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(74);
		}
		return planOfCareActivitySubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanOfCareActivitySupply() {
		if (planOfCareActivitySupplyEClass == null) {
			planOfCareActivitySupplyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(75);
		}
		return planOfCareActivitySupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProceduresSection() {
		if (proceduresSectionEClass == null) {
			proceduresSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(30);
		}
		return proceduresSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProceduresSectionEntriesOptional() {
		if (proceduresSectionEntriesOptionalEClass == null) {
			proceduresSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(31);
		}
		return proceduresSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureActivityObservation() {
		if (procedureActivityObservationEClass == null) {
			procedureActivityObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(32);
		}
		return procedureActivityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureActivityAct() {
		if (procedureActivityActEClass == null) {
			procedureActivityActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(33);
		}
		return procedureActivityActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureActivityProcedure() {
		if (procedureActivityProcedureEClass == null) {
			procedureActivityProcedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(7);
		}
		return procedureActivityProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVitalSignsSectionEntriesOptional() {
		if (vitalSignsSectionEntriesOptionalEClass == null) {
			vitalSignsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(82);
		}
		return vitalSignsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFamilyHistorySection() {
		if (familyHistorySectionEClass == null) {
			familyHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(45);
		}
		return familyHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFamilyHistoryOrganizer() {
		if (familyHistoryOrganizerEClass == null) {
			familyHistoryOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(46);
		}
		return familyHistoryOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFamilyHistoryObservation() {
		if (familyHistoryObservationEClass == null) {
			familyHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(47);
		}
		return familyHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFamilyHistoryDeathObservation() {
		if (familyHistoryDeathObservationEClass == null) {
			familyHistoryDeathObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(48);
		}
		return familyHistoryDeathObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSocialHistorySection() {
		if (socialHistorySectionEClass == null) {
			socialHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(76);
		}
		return socialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSocialHistoryObservation() {
		if (socialHistoryObservationEClass == null) {
			socialHistoryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(77);
		}
		return socialHistoryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPregnancyObservation() {
		if (pregnancyObservationEClass == null) {
			pregnancyObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(78);
		}
		return pregnancyObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEstimatedDateOfDelivery() {
		if (estimatedDateOfDeliveryEClass == null) {
			estimatedDateOfDeliveryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(79);
		}
		return estimatedDateOfDeliveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSmokingStatusObservation() {
		if (smokingStatusObservationEClass == null) {
			smokingStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(80);
		}
		return smokingStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTobaccoUse() {
		if (tobaccoUseEClass == null) {
			tobaccoUseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(81);
		}
		return tobaccoUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultsSection() {
		if (resultsSectionEClass == null) {
			resultsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(34);
		}
		return resultsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultsSectionEntriesOptional() {
		if (resultsSectionEntriesOptionalEClass == null) {
			resultsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(35);
		}
		return resultsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultOrganizer() {
		if (resultOrganizerEClass == null) {
			resultOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(36);
		}
		return resultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultObservation() {
		if (resultObservationEClass == null) {
			resultObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(37);
		}
		return resultObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicalEquipmentSection() {
		if (medicalEquipmentSectionEClass == null) {
			medicalEquipmentSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(65);
		}
		return medicalEquipmentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalStatusSection() {
		if (functionalStatusSectionEClass == null) {
			functionalStatusSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(49);
		}
		return functionalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalStatusResultOrganizer() {
		if (functionalStatusResultOrganizerEClass == null) {
			functionalStatusResultOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(50);
		}
		return functionalStatusResultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalStatusResultObservation() {
		if (functionalStatusResultObservationEClass == null) {
			functionalStatusResultObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(51);
		}
		return functionalStatusResultObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCaregiverCharacteristics() {
		if (caregiverCharacteristicsEClass == null) {
			caregiverCharacteristicsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(52);
		}
		return caregiverCharacteristicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentScaleObservation() {
		if (assessmentScaleObservationEClass == null) {
			assessmentScaleObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(53);
		}
		return assessmentScaleObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentScaleSupportingObservation() {
		if (assessmentScaleSupportingObservationEClass == null) {
			assessmentScaleSupportingObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(54);
		}
		return assessmentScaleSupportingObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCognitiveStatusResultOrganizer() {
		if (cognitiveStatusResultOrganizerEClass == null) {
			cognitiveStatusResultOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(55);
		}
		return cognitiveStatusResultOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCognitiveStatusResultObservation() {
		if (cognitiveStatusResultObservationEClass == null) {
			cognitiveStatusResultObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(56);
		}
		return cognitiveStatusResultObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalStatusProblemObservation() {
		if (functionalStatusProblemObservationEClass == null) {
			functionalStatusProblemObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(57);
		}
		return functionalStatusProblemObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCognitiveStatusProblemObservation() {
		if (cognitiveStatusProblemObservationEClass == null) {
			cognitiveStatusProblemObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(58);
		}
		return cognitiveStatusProblemObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPressureUlcerObservation() {
		if (pressureUlcerObservationEClass == null) {
			pressureUlcerObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(59);
		}
		return pressureUlcerObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberOfPressureUlcersObservation() {
		if (numberOfPressureUlcersObservationEClass == null) {
			numberOfPressureUlcersObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(60);
		}
		return numberOfPressureUlcersObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHighestPressureUlcerStage() {
		if (highestPressureUlcerStageEClass == null) {
			highestPressureUlcerStageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(61);
		}
		return highestPressureUlcerStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProblemSection() {
		if (problemSectionEClass == null) {
			problemSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(28);
		}
		return problemSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProblemSectionEntriesOptional() {
		if (problemSectionEntriesOptionalEClass == null) {
			problemSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(29);
		}
		return problemSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdvanceDirectivesSection() {
		if (advanceDirectivesSectionEClass == null) {
			advanceDirectivesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(38);
		}
		return advanceDirectivesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdvanceDirectiveObservation() {
		if (advanceDirectiveObservationEClass == null) {
			advanceDirectiveObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(40);
		}
		return advanceDirectiveObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncountersSection() {
		if (encountersSectionEClass == null) {
			encountersSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(41);
		}
		return encountersSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncounterActivities() {
		if (encounterActivitiesEClass == null) {
			encounterActivitiesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(43);
		}
		return encounterActivitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncounterDiagnosis() {
		if (encounterDiagnosisEClass == null) {
			encounterDiagnosisEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(44);
		}
		return encounterDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceDeliveryLocation() {
		if (serviceDeliveryLocationEClass == null) {
			serviceDeliveryLocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(9);
		}
		return serviceDeliveryLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmunizationsSection() {
		if (immunizationsSectionEClass == null) {
			immunizationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(85);
		}
		return immunizationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmunizationActivity() {
		if (immunizationActivityEClass == null) {
			immunizationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(63);
		}
		return immunizationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmunizationRefusalReason() {
		if (immunizationRefusalReasonEClass == null) {
			immunizationRefusalReasonEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(64);
		}
		return immunizationRefusalReasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVitalSignsSection() {
		if (vitalSignsSectionEClass == null) {
			vitalSignsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(86);
		}
		return vitalSignsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVitalSignsOrganizer() {
		if (vitalSignsOrganizerEClass == null) {
			vitalSignsOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(83);
		}
		return vitalSignsOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVitalSignObservation() {
		if (vitalSignObservationEClass == null) {
			vitalSignObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(84);
		}
		return vitalSignObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoryOfPastIllnessSection() {
		if (historyOfPastIllnessSectionEClass == null) {
			historyOfPastIllnessSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(87);
		}
		return historyOfPastIllnessSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChiefComplaintSection() {
		if (chiefComplaintSectionEClass == null) {
			chiefComplaintSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(88);
		}
		return chiefComplaintSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReasonForReferralSection() {
		if (reasonForReferralSectionEClass == null) {
			reasonForReferralSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(89);
		}
		return reasonForReferralSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoryOfPresentIllnessSection() {
		if (historyOfPresentIllnessSectionEClass == null) {
			historyOfPresentIllnessSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(90);
		}
		return historyOfPresentIllnessSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalAdmissionDiagnosisSection() {
		if (hospitalAdmissionDiagnosisSectionEClass == null) {
			hospitalAdmissionDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(91);
		}
		return hospitalAdmissionDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalDischargeDiagnosisSection() {
		if (hospitalDischargeDiagnosisSectionEClass == null) {
			hospitalDischargeDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(104);
		}
		return hospitalDischargeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalAdmissionMedicationsSectionEntriesOptional() {
		if (hospitalAdmissionMedicationsSectionEntriesOptionalEClass == null) {
			hospitalAdmissionMedicationsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(93);
		}
		return hospitalAdmissionMedicationsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmissionMedication() {
		if (admissionMedicationEClass == null) {
			admissionMedicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(94);
		}
		return admissionMedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalDischargeMedicationsSection() {
		if (hospitalDischargeMedicationsSectionEClass == null) {
			hospitalDischargeMedicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(119);
		}
		return hospitalDischargeMedicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalDischargePhysicalSection() {
		if (hospitalDischargePhysicalSectionEClass == null) {
			hospitalDischargePhysicalSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(113);
		}
		return hospitalDischargePhysicalSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChiefComplaintAndReasonForVisitSection() {
		if (chiefComplaintAndReasonForVisitSectionEClass == null) {
			chiefComplaintAndReasonForVisitSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(110);
		}
		return chiefComplaintAndReasonForVisitSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReasonForVisitSection() {
		if (reasonForVisitSectionEClass == null) {
			reasonForVisitSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(115);
		}
		return reasonForVisitSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnesthesiaSection() {
		if (anesthesiaSectionEClass == null) {
			anesthesiaSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(120);
		}
		return anesthesiaSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplicationsSection() {
		if (complicationsSectionEClass == null) {
			complicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(121);
		}
		return complicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDICOMObjectCatalogSection() {
		if (dicomObjectCatalogSectionEClass == null) {
			dicomObjectCatalogSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(122);
		}
		return dicomObjectCatalogSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStudyAct() {
		if (studyActEClass == null) {
			studyActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(123);
		}
		return studyActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeriesAct() {
		if (seriesActEClass == null) {
			seriesActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(124);
		}
		return seriesActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSOPInstanceObservation() {
		if (sopInstanceObservationEClass == null) {
			sopInstanceObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(125);
		}
		return sopInstanceObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPurposeofReferenceObservation() {
		if (purposeofReferenceObservationEClass == null) {
			purposeofReferenceObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(126);
		}
		return purposeofReferenceObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferencedFramesObservation() {
		if (referencedFramesObservationEClass == null) {
			referencedFramesObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(127);
		}
		return referencedFramesObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundaryObservation() {
		if (boundaryObservationEClass == null) {
			boundaryObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(128);
		}
		return boundaryObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFindingsSection() {
		if (findingsSectionEClass == null) {
			findingsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(129);
		}
		return findingsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalConsultationsSection() {
		if (hospitalConsultationsSectionEClass == null) {
			hospitalConsultationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(111);
		}
		return hospitalConsultationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterventionsSection() {
		if (interventionsSectionEClass == null) {
			interventionsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(130);
		}
		return interventionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicalHistorySection() {
		if (medicalHistorySectionEClass == null) {
			medicalHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(131);
		}
		return medicalHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectiveSection() {
		if (objectiveSectionEClass == null) {
			objectiveSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(132);
		}
		return objectiveSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperativeNoteFluidSection() {
		if (operativeNoteFluidSectionEClass == null) {
			operativeNoteFluidSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(133);
		}
		return operativeNoteFluidSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperativeNoteSurgicalProcedureSection() {
		if (operativeNoteSurgicalProcedureSectionEClass == null) {
			operativeNoteSurgicalProcedureSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(134);
		}
		return operativeNoteSurgicalProcedureSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlannedProcedureSection() {
		if (plannedProcedureSectionEClass == null) {
			plannedProcedureSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(135);
		}
		return plannedProcedureSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostoperativeDiagnosisSection() {
		if (postoperativeDiagnosisSectionEClass == null) {
			postoperativeDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(136);
		}
		return postoperativeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostprocedureDiagnosisSection() {
		if (postprocedureDiagnosisSectionEClass == null) {
			postprocedureDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(137);
		}
		return postprocedureDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostprocedureDiagnosis() {
		if (postprocedureDiagnosisEClass == null) {
			postprocedureDiagnosisEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(138);
		}
		return postprocedureDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreoperativeDiagnosisSection() {
		if (preoperativeDiagnosisSectionEClass == null) {
			preoperativeDiagnosisSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(139);
		}
		return preoperativeDiagnosisSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureDescriptionSection() {
		if (procedureDescriptionSectionEClass == null) {
			procedureDescriptionSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(141);
		}
		return procedureDescriptionSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureDispositionSection() {
		if (procedureDispositionSectionEClass == null) {
			procedureDispositionSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(142);
		}
		return procedureDispositionSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureEstimatedBloodLossSection() {
		if (procedureEstimatedBloodLossSectionEClass == null) {
			procedureEstimatedBloodLossSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(143);
		}
		return procedureEstimatedBloodLossSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureFindingsSection() {
		if (procedureFindingsSectionEClass == null) {
			procedureFindingsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(144);
		}
		return procedureFindingsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureImplantsSection() {
		if (procedureImplantsSectionEClass == null) {
			procedureImplantsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(145);
		}
		return procedureImplantsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureIndicationsSection() {
		if (procedureIndicationsSectionEClass == null) {
			procedureIndicationsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(146);
		}
		return procedureIndicationsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureSpecimensTakenSection() {
		if (procedureSpecimensTakenSectionEClass == null) {
			procedureSpecimensTakenSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(147);
		}
		return procedureSpecimensTakenSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubjectiveSection() {
		if (subjectiveSectionEClass == null) {
			subjectiveSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(148);
		}
		return subjectiveSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsultationNote() {
		if (consultationNoteEClass == null) {
			consultationNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(149);
		}
		return consultationNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentSection() {
		if (assessmentSectionEClass == null) {
			assessmentSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(150);
		}
		return assessmentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoryAndPhysicalNote() {
		if (historyAndPhysicalNoteEClass == null) {
			historyAndPhysicalNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(151);
		}
		return historyAndPhysicalNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperativeNote() {
		if (operativeNoteEClass == null) {
			operativeNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(153);
		}
		return operativeNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureNote() {
		if (procedureNoteEClass == null) {
			procedureNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(154);
		}
		return procedureNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgressNote() {
		if (progressNoteEClass == null) {
			progressNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(155);
		}
		return progressNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreoperativeDiagnosis() {
		if (preoperativeDiagnosisEClass == null) {
			preoperativeDiagnosisEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(140);
		}
		return preoperativeDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstructionsSection() {
		if (instructionsSectionEClass == null) {
			instructionsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(152);
		}
		return instructionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalAdmissionDiagnosis() {
		if (hospitalAdmissionDiagnosisEClass == null) {
			hospitalAdmissionDiagnosisEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(92);
		}
		return hospitalAdmissionDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiagnosticImagingReport() {
		if (diagnosticImagingReportEClass == null) {
			diagnosticImagingReportEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(156);
		}
		return diagnosticImagingReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicianReadingStudyPerformer() {
		if (physicianReadingStudyPerformerEClass == null) {
			physicianReadingStudyPerformerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(157);
		}
		return physicianReadingStudyPerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicianofRecordParticipant() {
		if (physicianofRecordParticipantEClass == null) {
			physicianofRecordParticipantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(158);
		}
		return physicianofRecordParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextObservation() {
		if (textObservationEClass == null) {
			textObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(159);
		}
		return textObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantityMeasurementObservation() {
		if (quantityMeasurementObservationEClass == null) {
			quantityMeasurementObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(160);
		}
		return quantityMeasurementObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeObservations() {
		if (codeObservationsEClass == null) {
			codeObservationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(161);
		}
		return codeObservationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureContext() {
		if (procedureContextEClass == null) {
			procedureContextEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(162);
		}
		return procedureContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationUseNoneKnown() {
		if (medicationUseNoneKnownEClass == null) {
			medicationUseNoneKnownEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(163);
		}
		return medicationUseNoneKnownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeceasedObservation() {
		if (deceasedObservationEClass == null) {
			deceasedObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(164);
		}
		return deceasedObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFetusSubjectContext() {
		if (fetusSubjectContextEClass == null) {
			fetusSubjectContextEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(165);
		}
		return fetusSubjectContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObserverContext() {
		if (observerContextEClass == null) {
			observerContextEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(166);
		}
		return observerContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryReference() {
		if (entryReferenceEClass == null) {
			entryReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(167);
		}
		return entryReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdvanceDirectiveOrganizer() {
		if (advanceDirectiveOrganizerEClass == null) {
			advanceDirectiveOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(168);
		}
		return advanceDirectiveOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCharacteristicsOfHomeEnvironment() {
		if (characteristicsOfHomeEnvironmentEClass == null) {
			characteristicsOfHomeEnvironmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(170);
		}
		return characteristicsOfHomeEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCognitiveAbilitiesObservation() {
		if (cognitiveAbilitiesObservationEClass == null) {
			cognitiveAbilitiesObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(171);
		}
		return cognitiveAbilitiesObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCulturalAndReligiousObservation() {
		if (culturalAndReligiousObservationEClass == null) {
			culturalAndReligiousObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(172);
		}
		return culturalAndReligiousObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDrugMonitoringAct() {
		if (drugMonitoringActEClass == null) {
			drugMonitoringActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(173);
		}
		return drugMonitoringActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandoffCommunicationParticipants() {
		if (handoffCommunicationParticipantsEClass == null) {
			handoffCommunicationParticipantsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(174);
		}
		return handoffCommunicationParticipantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicalEquipmentOrganizer() {
		if (medicalEquipmentOrganizerEClass == null) {
			medicalEquipmentOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(175);
		}
		return medicalEquipmentOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMentalStatusObservation() {
		if (mentalStatusObservationEClass == null) {
			mentalStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(187);
		}
		return mentalStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNutritionAssessment() {
		if (nutritionAssessmentEClass == null) {
			nutritionAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(188);
		}
		return nutritionAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionRecommendation() {
		if (nutritionRecommendationEClass == null) {
			nutritionRecommendationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(189);
		}
		return nutritionRecommendationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNutritionalStatusObservation() {
		if (nutritionalStatusObservationEClass == null) {
			nutritionalStatusObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(198);
		}
		return nutritionalStatusObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutcomeObservation() {
		if (outcomeObservationEClass == null) {
			outcomeObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(199);
		}
		return outcomeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatientReferralAct() {
		if (patientReferralActEClass == null) {
			patientReferralActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(201);
		}
		return patientReferralActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlannedCoverage() {
		if (plannedCoverageEClass == null) {
			plannedCoverageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(194);
		}
		return plannedCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoalObservation() {
		if (goalObservationEClass == null) {
			goalObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(202);
		}
		return goalObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthConcernAct() {
		if (healthConcernActEClass == null) {
			healthConcernActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(203);
		}
		return healthConcernActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterventionAct() {
		if (interventionActEClass == null) {
			interventionActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(229);
		}
		return interventionActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalDocumentReference() {
		if (externalDocumentReferenceEClass == null) {
			externalDocumentReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(236);
		}
		return externalDocumentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlannedImmunizationActivity() {
		if (plannedImmunizationActivityEClass == null) {
			plannedImmunizationActivityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(235);
		}
		return plannedImmunizationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrognosisObservation() {
		if (prognosisObservationEClass == null) {
			prognosisObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(210);
		}
		return prognosisObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgressTowardGoalObservation() {
		if (progressTowardGoalObservationEClass == null) {
			progressTowardGoalObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(200);
		}
		return progressTowardGoalObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelfCareActivities() {
		if (selfCareActivitiesEClass == null) {
			selfCareActivitiesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(206);
		}
		return selfCareActivitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensoryStatus() {
		if (sensoryStatusEClass == null) {
			sensoryStatusEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(207);
		}
		return sensoryStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongitudinalCareWoundObservation() {
		if (longitudinalCareWoundObservationEClass == null) {
			longitudinalCareWoundObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(208);
		}
		return longitudinalCareWoundObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubstanceAdministeredAct() {
		if (substanceAdministeredActEClass == null) {
			substanceAdministeredActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(181);
		}
		return substanceAdministeredActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberOfPressureUlcersObservation2() {
		if (numberOfPressureUlcersObservation2EClass == null) {
			numberOfPressureUlcersObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(213);
		}
		return numberOfPressureUlcersObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWoundMeasurementObservation() {
		if (woundMeasurementObservationEClass == null) {
			woundMeasurementObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(211);
		}
		return woundMeasurementObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWoundCharacteristic() {
		if (woundCharacteristicEClass == null) {
			woundCharacteristicEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(212);
		}
		return woundCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoalsSection() {
		if (goalsSectionEClass == null) {
			goalsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(237);
		}
		return goalsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthConcernsSection() {
		if (healthConcernsSectionEClass == null) {
			healthConcernsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(238);
		}
		return healthConcernsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMentalStatusSection() {
		if (mentalStatusSectionEClass == null) {
			mentalStatusSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(242);
		}
		return mentalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMentalStatusOrganizer2() {
		if (mentalStatusOrganizer2EClass == null) {
			mentalStatusOrganizer2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(243);
		}
		return mentalStatusOrganizer2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNutritionSection() {
		if (nutritionSectionEClass == null) {
			nutritionSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(244);
		}
		return nutritionSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalFindingsOfSkinSection() {
		if (physicalFindingsOfSkinSectionEClass == null) {
			physicalFindingsOfSkinSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(245);
		}
		return physicalFindingsOfSkinSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUSRealmHeader2() {
		if (usRealmHeader2EClass == null) {
			usRealmHeader2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(246);
		}
		return usRealmHeader2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarePlan() {
		if (carePlanEClass == null) {
			carePlanEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(247);
		}
		return carePlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferralNote() {
		if (referralNoteEClass == null) {
			referralNoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(249);
		}
		return referralNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransferSummary() {
		if (transferSummaryEClass == null) {
			transferSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(276);
		}
		return transferSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUSRealmHeaderPatientGeneratedDocument() {
		if (usRealmHeaderPatientGeneratedDocumentEClass == null) {
			usRealmHeaderPatientGeneratedDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(290);
		}
		return usRealmHeaderPatientGeneratedDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorParticipation() {
		if (authorParticipationEClass == null) {
			authorParticipationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(291);
		}
		return authorParticipationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmissionMedication2() {
		if (admissionMedication2EClass == null) {
			admissionMedication2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(287);
		}
		return admissionMedication2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdvanceDirectiveObservation2() {
		if (advanceDirectiveObservation2EClass == null) {
			advanceDirectiveObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(169);
		}
		return advanceDirectiveObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllergyConcernAct2() {
		if (allergyConcernAct2EClass == null) {
			allergyConcernAct2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(269);
		}
		return allergyConcernAct2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllergyObservation2() {
		if (allergyObservation2EClass == null) {
			allergyObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(214);
		}
		return allergyObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMentalStatusObservation2() {
		if (mentalStatusObservation2EClass == null) {
			mentalStatusObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(215);
		}
		return mentalStatusObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmokingStatusMeaningfulUse2() {
		if (smokingStatusMeaningfulUse2EClass == null) {
			smokingStatusMeaningfulUse2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(216);
		}
		return smokingStatusMeaningfulUse2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoverageActivity2() {
		if (coverageActivity2EClass == null) {
			coverageActivity2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(281);
		}
		return coverageActivity2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeceasedObservation2() {
		if (deceasedObservation2EClass == null) {
			deceasedObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(292);
		}
		return deceasedObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDischargeMedication2() {
		if (dischargeMedication2EClass == null) {
			dischargeMedication2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(293);
		}
		return dischargeMedication2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncounterActivity2() {
		if (encounterActivity2EClass == null) {
			encounterActivity2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(233);
		}
		return encounterActivity2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncounterDiagnosis2() {
		if (encounterDiagnosis2EClass == null) {
			encounterDiagnosis2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(217);
		}
		return encounterDiagnosis2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalStatusObservation2() {
		if (functionalStatusObservation2EClass == null) {
			functionalStatusObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(218);
		}
		return functionalStatusObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalStatusOrganizer2() {
		if (functionalStatusOrganizer2EClass == null) {
			functionalStatusOrganizer2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(264);
		}
		return functionalStatusOrganizer2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthStatusObservation2() {
		if (healthStatusObservation2EClass == null) {
			healthStatusObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(239);
		}
		return healthStatusObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalAdmissionDiagnosis2() {
		if (hospitalAdmissionDiagnosis2EClass == null) {
			hospitalAdmissionDiagnosis2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(219);
		}
		return hospitalAdmissionDiagnosis2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalDischargeDiagnosis2() {
		if (hospitalDischargeDiagnosis2EClass == null) {
			hospitalDischargeDiagnosis2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(285);
		}
		return hospitalDischargeDiagnosis2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmunizationActivity2() {
		if (immunizationActivity2EClass == null) {
			immunizationActivity2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(230);
		}
		return immunizationActivity2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmunizationMedicationInformation2() {
		if (immunizationMedicationInformation2EClass == null) {
			immunizationMedicationInformation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(294);
		}
		return immunizationMedicationInformation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndication2() {
		if (indication2EClass == null) {
			indication2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(179);
		}
		return indication2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstruction2() {
		if (instruction2EClass == null) {
			instruction2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(177);
		}
		return instruction2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationActivity2() {
		if (medicationActivity2EClass == null) {
			medicationActivity2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(180);
		}
		return medicationActivity2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationDispense2() {
		if (medicationDispense2EClass == null) {
			medicationDispense2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(183);
		}
		return medicationDispense2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationInformation2() {
		if (medicationInformation2EClass == null) {
			medicationInformation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(295);
		}
		return medicationInformation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationSupplyOrder2() {
		if (medicationSupplyOrder2EClass == null) {
			medicationSupplyOrder2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(182);
		}
		return medicationSupplyOrder2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNonMedicinalSupplyActivity2() {
		if (nonMedicinalSupplyActivity2EClass == null) {
			nonMedicinalSupplyActivity2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(176);
		}
		return nonMedicinalSupplyActivity2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicianofRecordParticipant2() {
		if (physicianofRecordParticipant2EClass == null) {
			physicianofRecordParticipant2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(296);
		}
		return physicianofRecordParticipant2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlannedAct2() {
		if (plannedAct2EClass == null) {
			plannedAct2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(197);
		}
		return plannedAct2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlannedEncounter2() {
		if (plannedEncounter2EClass == null) {
			plannedEncounter2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(190);
		}
		return plannedEncounter2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorityPreference() {
		if (priorityPreferenceEClass == null) {
			priorityPreferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(191);
		}
		return priorityPreferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlannedObservation2() {
		if (plannedObservation2EClass == null) {
			plannedObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(193);
		}
		return plannedObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlannedProcedure2() {
		if (plannedProcedure2EClass == null) {
			plannedProcedure2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(195);
		}
		return plannedProcedure2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlannedMedicationActivity2() {
		if (plannedMedicationActivity2EClass == null) {
			plannedMedicationActivity2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(192);
		}
		return plannedMedicationActivity2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlannedSupply2() {
		if (plannedSupply2EClass == null) {
			plannedSupply2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(196);
		}
		return plannedSupply2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyActivity2() {
		if (policyActivity2EClass == null) {
			policyActivity2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(282);
		}
		return policyActivity2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostprocedureDiagnosis2() {
		if (postprocedureDiagnosis2EClass == null) {
			postprocedureDiagnosis2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(220);
		}
		return postprocedureDiagnosis2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreoperativeDiagnosis2() {
		if (preoperativeDiagnosis2EClass == null) {
			preoperativeDiagnosis2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(221);
		}
		return preoperativeDiagnosis2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProblemConcernAct2() {
		if (problemConcernAct2EClass == null) {
			problemConcernAct2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(228);
		}
		return problemConcernAct2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProblemObservation2() {
		if (problemObservation2EClass == null) {
			problemObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(209);
		}
		return problemObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureActivityAct2() {
		if (procedureActivityAct2EClass == null) {
			procedureActivityAct2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(231);
		}
		return procedureActivityAct2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureActivityObservation2() {
		if (procedureActivityObservation2EClass == null) {
			procedureActivityObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(232);
		}
		return procedureActivityObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureActivityProcedure2() {
		if (procedureActivityProcedure2EClass == null) {
			procedureActivityProcedure2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(178);
		}
		return procedureActivityProcedure2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReactionObservation2() {
		if (reactionObservation2EClass == null) {
			reactionObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(184);
		}
		return reactionObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultObservation2() {
		if (resultObservation2EClass == null) {
			resultObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(222);
		}
		return resultObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultOrganizer2() {
		if (resultOrganizer2EClass == null) {
			resultOrganizer2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(227);
		}
		return resultOrganizer2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeverityObservation2() {
		if (severityObservation2EClass == null) {
			severityObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(185);
		}
		return severityObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationFreeTextSig() {
		if (medicationFreeTextSigEClass == null) {
			medicationFreeTextSigEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(186);
		}
		return medicationFreeTextSigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSocialHistoryObservation2() {
		if (socialHistoryObservation2EClass == null) {
			socialHistoryObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(223);
		}
		return socialHistoryObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubstanceOrDeviceAllergyObservation2() {
		if (substanceOrDeviceAllergyObservation2EClass == null) {
			substanceOrDeviceAllergyObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(224);
		}
		return substanceOrDeviceAllergyObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTobaccoUse2() {
		if (tobaccoUse2EClass == null) {
			tobaccoUse2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(225);
		}
		return tobaccoUse2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVitalSignObservation2() {
		if (vitalSignObservation2EClass == null) {
			vitalSignObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(226);
		}
		return vitalSignObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVitalSignsOrganizer2() {
		if (vitalSignsOrganizer2EClass == null) {
			vitalSignsOrganizer2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(262);
		}
		return vitalSignsOrganizer2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnesthesiaSection2() {
		if (anesthesiaSection2EClass == null) {
			anesthesiaSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(297);
		}
		return anesthesiaSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentAndPlanSection2() {
		if (assessmentAndPlanSection2EClass == null) {
			assessmentAndPlanSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(270);
		}
		return assessmentAndPlanSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplicationsSection2() {
		if (complicationsSection2EClass == null) {
			complicationsSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(298);
		}
		return complicationsSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdmissionDiagnosisSection2() {
		if (admissionDiagnosisSection2EClass == null) {
			admissionDiagnosisSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(288);
		}
		return admissionDiagnosisSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdmissionMedicationsSectionEntriesOptional2() {
		if (admissionMedicationsSectionEntriesOptional2EClass == null) {
			admissionMedicationsSectionEntriesOptional2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(286);
		}
		return admissionMedicationsSectionEntriesOptional2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeMedicationsSectionEntriesOptional2() {
		if (dischargeMedicationsSectionEntriesOptional2EClass == null) {
			dischargeMedicationsSectionEntriesOptional2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(299);
		}
		return dischargeMedicationsSectionEntriesOptional2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncountersSectionEntriesOptional2() {
		if (encountersSectionEntriesOptional2EClass == null) {
			encountersSectionEntriesOptional2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(279);
		}
		return encountersSectionEntriesOptional2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeDiagnosisSection2() {
		if (dischargeDiagnosisSection2EClass == null) {
			dischargeDiagnosisSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(284);
		}
		return dischargeDiagnosisSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalStatusSection2() {
		if (functionalStatusSection2EClass == null) {
			functionalStatusSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(263);
		}
		return functionalStatusSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistoryOfPastIllnessSection2() {
		if (historyOfPastIllnessSection2EClass == null) {
			historyOfPastIllnessSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(271);
		}
		return historyOfPastIllnessSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmunizationsSectionEntriesOptional2() {
		if (immunizationsSectionEntriesOptional2EClass == null) {
			immunizationsSectionEntriesOptional2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(253);
		}
		return immunizationsSectionEntriesOptional2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstructionsSection2() {
		if (instructionsSection2EClass == null) {
			instructionsSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(300);
		}
		return instructionsSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterventionsSection2() {
		if (interventionsSection2EClass == null) {
			interventionsSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(248);
		}
		return interventionsSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicalEquipmentSection2() {
		if (medicalEquipmentSection2EClass == null) {
			medicalEquipmentSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(266);
		}
		return medicalEquipmentSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationsAdministeredSection2() {
		if (medicationsAdministeredSection2EClass == null) {
			medicationsAdministeredSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(301);
		}
		return medicationsAdministeredSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayersSection2() {
		if (payersSection2EClass == null) {
			payersSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(280);
		}
		return payersSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalExamSection2() {
		if (physicalExamSection2EClass == null) {
			physicalExamSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(265);
		}
		return physicalExamSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanOfTreatmentSection2() {
		if (planOfTreatmentSection2EClass == null) {
			planOfTreatmentSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(250);
		}
		return planOfTreatmentSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlannedProcedureSection2() {
		if (plannedProcedureSection2EClass == null) {
			plannedProcedureSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(302);
		}
		return plannedProcedureSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostprocedureDiagnosisSection2() {
		if (postprocedureDiagnosisSection2EClass == null) {
			postprocedureDiagnosisSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(303);
		}
		return postprocedureDiagnosisSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreoperativeDiagnosisSection2() {
		if (preoperativeDiagnosisSection2EClass == null) {
			preoperativeDiagnosisSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(304);
		}
		return preoperativeDiagnosisSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureFindingsSection2() {
		if (procedureFindingsSection2EClass == null) {
			procedureFindingsSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(305);
		}
		return procedureFindingsSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcedureIndicationsSection2() {
		if (procedureIndicationsSection2EClass == null) {
			procedureIndicationsSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(306);
		}
		return procedureIndicationsSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeMedicationsSection2() {
		if (dischargeMedicationsSection2EClass == null) {
			dischargeMedicationsSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(307);
		}
		return dischargeMedicationsSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProceduresSectionEntriesOptional2() {
		if (proceduresSectionEntriesOptional2EClass == null) {
			proceduresSectionEntriesOptional2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(256);
		}
		return proceduresSectionEntriesOptional2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReasonForReferralSection2() {
		if (reasonForReferralSection2EClass == null) {
			reasonForReferralSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(274);
		}
		return reasonForReferralSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultsSectionEntriesOptional2() {
		if (resultsSectionEntriesOptional2EClass == null) {
			resultsSectionEntriesOptional2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(258);
		}
		return resultsSectionEntriesOptional2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSocialHistorySection2() {
		if (socialHistorySection2EClass == null) {
			socialHistorySection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(259);
		}
		return socialHistorySection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVitalSignsSectionEntriesOptional2() {
		if (vitalSignsSectionEntriesOptional2EClass == null) {
			vitalSignsSectionEntriesOptional2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(261);
		}
		return vitalSignsSectionEntriesOptional2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdvanceDirectivesSectionEntriesOptional2() {
		if (advanceDirectivesSectionEntriesOptional2EClass == null) {
			advanceDirectivesSectionEntriesOptional2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(251);
		}
		return advanceDirectivesSectionEntriesOptional2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationsSectionEntriesOptional2() {
		if (medicationsSectionEntriesOptional2EClass == null) {
			medicationsSectionEntriesOptional2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(273);
		}
		return medicationsSectionEntriesOptional2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProblemSectionEntriesOptional2() {
		if (problemSectionEntriesOptional2EClass == null) {
			problemSectionEntriesOptional2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(255);
		}
		return problemSectionEntriesOptional2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdvanceDirectivesSection2() {
		if (advanceDirectivesSection2EClass == null) {
			advanceDirectivesSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(277);
		}
		return advanceDirectivesSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllergiesSectionEntriesOptional2() {
		if (allergiesSectionEntriesOptional2EClass == null) {
			allergiesSectionEntriesOptional2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(268);
		}
		return allergiesSectionEntriesOptional2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllergiesSection2() {
		if (allergiesSection2EClass == null) {
			allergiesSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(267);
		}
		return allergiesSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncountersSection2() {
		if (encountersSection2EClass == null) {
			encountersSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(278);
		}
		return encountersSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmunizationsSection2() {
		if (immunizationsSection2EClass == null) {
			immunizationsSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(252);
		}
		return immunizationsSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationsSection2() {
		if (medicationsSection2EClass == null) {
			medicationsSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(272);
		}
		return medicationsSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProblemSection2() {
		if (problemSection2EClass == null) {
			problemSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(254);
		}
		return problemSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProceduresSection2() {
		if (proceduresSection2EClass == null) {
			proceduresSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(283);
		}
		return proceduresSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultsSection2() {
		if (resultsSection2EClass == null) {
			resultsSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(257);
		}
		return resultsSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVitalSignsSection2() {
		if (vitalSignsSection2EClass == null) {
			vitalSignsSection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(260);
		}
		return vitalSignsSection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsultationNote2() {
		if (consultationNote2EClass == null) {
			consultationNote2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(308);
		}
		return consultationNote2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuityOfCareDocument2() {
		if (continuityOfCareDocument2EClass == null) {
			continuityOfCareDocument2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(309);
		}
		return continuityOfCareDocument2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticImagingReport2() {
		if (diagnosticImagingReport2EClass == null) {
			diagnosticImagingReport2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(310);
		}
		return diagnosticImagingReport2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDischargeSummary2() {
		if (dischargeSummary2EClass == null) {
			dischargeSummary2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(311);
		}
		return dischargeSummary2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryAndPhysicalNote2() {
		if (historyAndPhysicalNote2EClass == null) {
			historyAndPhysicalNote2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(312);
		}
		return historyAndPhysicalNote2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperativeNote2() {
		if (operativeNote2EClass == null) {
			operativeNote2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(313);
		}
		return operativeNote2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureNote2() {
		if (procedureNote2EClass == null) {
			procedureNote2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(314);
		}
		return procedureNote2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressNote2() {
		if (progressNote2EClass == null) {
			progressNote2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(315);
		}
		return progressNote2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredDocument2() {
		if (unstructuredDocument2EClass == null) {
			unstructuredDocument2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(316);
		}
		return unstructuredDocument2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreconditionForSubstanceAdministration2() {
		if (preconditionForSubstanceAdministration2EClass == null) {
			preconditionForSubstanceAdministration2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(317);
		}
		return preconditionForSubstanceAdministration2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryObservation2() {
		if (familyHistoryObservation2EClass == null) {
			familyHistoryObservation2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(205);
		}
		return familyHistoryObservation2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthStatusEvaluationsAndOutcomesSection() {
		if (healthStatusEvaluationsAndOutcomesSectionEClass == null) {
			healthStatusEvaluationsAndOutcomesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(241);
		}
		return healthStatusEvaluationsAndOutcomesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistoryOrganizer2() {
		if (familyHistoryOrganizer2EClass == null) {
			familyHistoryOrganizer2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(204);
		}
		return familyHistoryOrganizer2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyHistorySection2() {
		if (familyHistorySection2EClass == null) {
			familyHistorySection2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(275);
		}
		return familyHistorySection2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicianReadingStudyPerformer2() {
		if (physicianReadingStudyPerformer2EClass == null) {
			physicianReadingStudyPerformer2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(318);
		}
		return physicianReadingStudyPerformer2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseOfCareSection() {
		if (courseOfCareSectionEClass == null) {
			courseOfCareSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(289);
		}
		return courseOfCareSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlannedInterventionAct() {
		if (plannedInterventionActEClass == null) {
			plannedInterventionActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(234);
		}
		return plannedInterventionActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskConcernAct() {
		if (riskConcernActEClass == null) {
			riskConcernActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(240);
		}
		return riskConcernActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationsAdministeredSection() {
		if (medicationsAdministeredSectionEClass == null) {
			medicationsAdministeredSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(95);
		}
		return medicationsAdministeredSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalExamSection() {
		if (physicalExamSectionEClass == null) {
			physicalExamSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(96);
		}
		return physicalExamSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralStatusSection() {
		if (generalStatusSectionEClass == null) {
			generalStatusSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(97);
		}
		return generalStatusSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReviewOfSystemsSection() {
		if (reviewOfSystemsSectionEClass == null) {
			reviewOfSystemsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(98);
		}
		return reviewOfSystemsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalCourseSection() {
		if (hospitalCourseSectionEClass == null) {
			hospitalCourseSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(109);
		}
		return hospitalCourseSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessmentAndPlanSection() {
		if (assessmentAndPlanSectionEClass == null) {
			assessmentAndPlanSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(99);
		}
		return assessmentAndPlanSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurgicalDrainsSection() {
		if (surgicalDrainsSectionEClass == null) {
			surgicalDrainsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(100);
		}
		return surgicalDrainsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnstructuredDocument() {
		if (unstructuredDocumentEClass == null) {
			unstructuredDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(101);
		}
		return unstructuredDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicationInformation() {
		if (medicationInformationEClass == null) {
			medicationInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(102);
		}
		return medicationInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDischargeSummary() {
		if (dischargeSummaryEClass == null) {
			dischargeSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(103);
		}
		return dischargeSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDischargeDietSection() {
		if (dischargeDietSectionEClass == null) {
			dischargeDietSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(106);
		}
		return dischargeDietSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalDischargeMedicationsSectionEntriesOptional() {
		if (hospitalDischargeMedicationsSectionEntriesOptionalEClass == null) {
			hospitalDischargeMedicationsSectionEntriesOptionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(107);
		}
		return hospitalDischargeMedicationsSectionEntriesOptionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreconditionForSubstanceAdministration() {
		if (preconditionForSubstanceAdministrationEClass == null) {
			preconditionForSubstanceAdministrationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(116);
		}
		return preconditionForSubstanceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmunizationMedicationInformation() {
		if (immunizationMedicationInformationEClass == null) {
			immunizationMedicationInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(117);
		}
		return immunizationMedicationInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalDischargeStudiesSummarySection() {
		if (hospitalDischargeStudiesSummarySectionEClass == null) {
			hospitalDischargeStudiesSummarySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(114);
		}
		return hospitalDischargeStudiesSummarySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDischargeMedication() {
		if (dischargeMedicationEClass == null) {
			dischargeMedicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(108);
		}
		return dischargeMedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalDischargeDiagnosis() {
		if (hospitalDischargeDiagnosisEClass == null) {
			hospitalDischargeDiagnosisEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(105);
		}
		return hospitalDischargeDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalDischargeInstructionsSection() {
		if (hospitalDischargeInstructionsSectionEClass == null) {
			hospitalDischargeInstructionsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				ConsolPackage.eNS_URI).getEClassifiers().get(112);
		}
		return hospitalDischargeInstructionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsolFactory getConsolFactory() {
		return (ConsolFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) {
			return;
		}
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) {
			return;
		}
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.openhealthtools.mdht.uml.cda.consol." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} // ConsolPackageImpl
