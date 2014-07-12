/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concomitant Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getConcomitantMedication()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Concomitant MedicationTemplateId Concomitant MedicationClassCode Concomitant MedicationId Concomitant MedicationMoodCode Concomitant MedicationConsumableMaterial Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue Concomitant MedicationconcomitantMedicationCategoryAssociationTypeCode Concomitant MedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory Concomitant MedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode Concomitant MedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode Concomitant MedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP Concomitant MedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode Concomitant MedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue Concomitant MedicationconcomitantMedicationIndicationAssociationTypeCode Concomitant MedicationconcomitantMedicationIndicationAssociationIndication Concomitant MedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode Concomitant MedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP Concomitant MedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode Concomitant MedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode Concomitant MedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue Concomitant MedicationconcomitantMedicationSubCategoryAssociationTypeCode Concomitant MedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory Concomitant MedicationIntendedRegimenAssociationintendedRegimenClassCode Concomitant MedicationIntendedRegimenAssociationintendedRegimenCodeP Concomitant MedicationIntendedRegimenAssociationintendedRegimenCode Concomitant MedicationIntendedRegimenAssociationintendedRegimenMoodCode Concomitant MedicationIntendedRegimenAssociationintendedRegimenValue Concomitant MedicationIntendedRegimenAssociationTypeCode Concomitant MedicationIntendedRegimenAssociationIntendedRegimen' templateId.root='2.16.840.1.113883.10.20.25.19' classCode='SBADM' constraints.validation.info='Concomitant MedicationDoseQuantity Concomitant MedicationEffectiveTime Concomitant MedicationRouteCode Concomitant MedicationText Concomitant MedicationMaxDoseQuantity Concomitant MedicationGroup Identifier Concomitant MedicationConcomitantMedicationCategoryAssociation Concomitant MedicationNonPerformanceReason Concomitant Medication indicationAssociation Concomitant MedicationConcomitantMedicationSubCategoryAssociation Concomitant MedicationIntendedRegimenAssociation Concomitant MedicationActivity Start Timing Reference Concomitant MedicationActivty End Timing Reference Concomitant MedicationPre-Specified Event Concomitant MedicationData Collection Concomitant MedicationStudy Day Period Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation' moodCode='EVN' constraints.validation.warning='Concomitant MedicationStatusCode' constraints.validation.query='Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue Concomitant MedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation Concomitant MedicationconcomitantMedicationCategoryAssociationTypeCode Concomitant MedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory Concomitant MedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode Concomitant MedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode Concomitant MedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP Concomitant MedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode Concomitant MedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue Concomitant MedicationconcomitantMedicationIndicationAssociationTypeCode Concomitant MedicationconcomitantMedicationIndicationAssociationIndication Concomitant MedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode Concomitant MedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP Concomitant MedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode Concomitant MedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode Concomitant MedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue Concomitant MedicationconcomitantMedicationSubCategoryAssociationTypeCode Concomitant MedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory Concomitant MedicationIntendedRegimenAssociationintendedRegimenClassCode Concomitant MedicationIntendedRegimenAssociationintendedRegimenCodeP Concomitant MedicationIntendedRegimenAssociationintendedRegimenCode Concomitant MedicationIntendedRegimenAssociationintendedRegimenMoodCode Concomitant MedicationIntendedRegimenAssociationintendedRegimenValue Concomitant MedicationIntendedRegimenAssociationTypeCode Concomitant MedicationIntendedRegimenAssociationIntendedRegimen'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConcomitantMedicationconcomitantMedicationSubCategoryAssociation typeCode='COMP' constraints.validation.error='concomitantMedicationSubCategoryAssociationTypeCode concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue' constraints.validation.query='concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue' constraints.validation.dependOn.concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode='concomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory classCode='OBS' constraints.validation.error='ConcomitantMedicationSubCategoryClassCode ConcomitantMedicationSubCategoryCode ConcomitantMedicationSubCategoryCodeP ConcomitantMedicationSubCategoryMoodCode ConcomitantMedicationSubCategoryValue' code.code='C83232' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Concomitant Medication Sub-Category' constraints.validation.dependOn.ConcomitantMedicationSubCategoryCode='ConcomitantMedicationSubCategoryCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConcomitantMedicationconcomitantMedicationIndicationAssociation typeCode='CAUS' constraints.validation.error='concomitantMedicationIndicationAssociationTypeCode concomitantMedicationIndicationAssociationIndication concomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode concomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode concomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP concomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode concomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue' constraints.validation.query='concomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode concomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode concomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP concomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode concomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue' constraints.validation.dependOn.concomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode='concomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndication classCode='OBS' constraints.validation.error='ConcomitantMedicationIndicationClassCode ConcomitantMedicationIndicationMoodCode ConcomitantMedicationIndicationCode ConcomitantMedicationIndicationCodeP ConcomitantMedicationIndicationValue' moodCode='EVN' code.code='C83085' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Concomitant Medication Indication' constraints.validation.dependOn.ConcomitantMedicationIndicationCode='ConcomitantMedicationIndicationCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConcomitantMedicationIntendedRegimenAssociation typeCode='REFR' constraints.validation.error='IntendedRegimenAssociationTypeCode IntendedRegimenAssociationIntendedRegimen IntendedRegimenAssociationintendedRegimenClassCode IntendedRegimenAssociationintendedRegimenCodeP IntendedRegimenAssociationintendedRegimenCode IntendedRegimenAssociationintendedRegimenMoodCode IntendedRegimenAssociationintendedRegimenValue' constraints.validation.query='IntendedRegimenAssociationintendedRegimenClassCode IntendedRegimenAssociationintendedRegimenCodeP IntendedRegimenAssociationintendedRegimenCode IntendedRegimenAssociationintendedRegimenMoodCode IntendedRegimenAssociationintendedRegimenValue' constraints.validation.dependOn.IntendedRegimenAssociationintendedRegimenCode='IntendedRegimenAssociationintendedRegimenCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConcomitantMedicationIntendedRegimenAssociationintendedRegimen classCode='OBS' constraints.validation.error='intendedRegimenClassCode intendedRegimenCode intendedRegimenCodeP intendedRegimenMoodCode intendedRegimenValue' code.code='C83232' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Concomitant Medication Regimen' constraints.validation.dependOn.intendedRegimenCode='intendedRegimenCodeP' moodCode='EVN'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConcomitantMedicationconcomitantMedicationCategoryAssociation typeCode='COMP' constraints.validation.error='concomitantMedicationCategoryAssociationTypeCode concomitantMedicationCategoryAssociationConcomitantMedicationCategory concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCodeconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode1 concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodePconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP1 concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode1 concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCodeconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode1 concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValueconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue1 concomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP concomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue' constraints.validation.query='concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCodeconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode1 concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodePconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP1 concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode1 concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCodeconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode1 concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValueconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue1 concomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP concomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode concomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue concomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation' constraints.validation.dependOn.concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode='concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP' constraints.validation.dependOn.concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode1='concomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP' constraints.validation.dependOn.concomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode='concomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP' constraints.validation.info='concomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategory constraints.validation.error='concomitantMedicationCategoryClassCode concomitantMedicationCategoryCode concomitantMedicationCategoryCodeP concomitantMedicationCategoryMoodCode concomitantMedicationCategoryValue concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCodeconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode1 concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodePconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP1 concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode1 concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCodeconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode1 concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValueconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue1' code.code='C83218' code.codeSystem='2.16.840.1.113883.3.26.1.1' code.codeSystemName='NCI Thesaurus' code.displayName='Concomitant Medication Category Code' constraints.validation.dependOn.concomitantMedicationCategoryCode='concomitantMedicationCategoryCodeP' constraints.validation.info='concomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation' constraints.validation.query='concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCodeconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode1 concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodePconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP1 concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode1 concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCodeconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode1 concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValueconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue1' constraints.validation.dependOn.concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode='concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP' constraints.validation.dependOn.concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode1='concomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP'"
 * @generated
 */
public interface ConcomitantMedication extends SubstanceAdministration
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.25.19\')'"
   * @generated
   */
  boolean validateConcomitantMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClass::SBADM'"
   * @generated
   */
  boolean validateConcomitantMedicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.doseQuantity.oclIsUndefined() or self.doseQuantity.isNullFlavorUndefined()) implies (not self.doseQuantity.oclIsUndefined())'"
   * @generated
   */
  boolean validateConcomitantMedicationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty())'"
   * @generated
   */
  boolean validateConcomitantMedicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())'"
   * @generated
   */
  boolean validateConcomitantMedicationRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
   * @generated
   */
  boolean validateConcomitantMedicationId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentSubstanceMood::EVN'"
   * @generated
   */
  boolean validateConcomitantMedicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
   * @generated
   */
  boolean validateConcomitantMedicationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())'"
   * @generated
   */
  boolean validateConcomitantMedicationText(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())'"
   * @generated
   */
  boolean validateConcomitantMedicationMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Group Identifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateConcomitantMedicationGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateConcomitantMedicationConcomitantMedicationCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Non Performance Reason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateConcomitantMedicationNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateConcomitantMedicationindicationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable->one(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(sdtm::Consumable Material))'"
   * @generated
   */
  boolean validateConcomitantMedicationConsumableMaterial(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateConcomitantMedicationConcomitantMedicationSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
  boolean validateConcomitantMedicationIntendedRegimenAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Activity Start Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
   * @generated
   */
  boolean validateConcomitantMedicationActivityStartTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Activity End Timing Reference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
   * @generated
   */
  boolean validateConcomitantMedicationActivtyEndTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Pre-Specified Event) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateConcomitantMedicationPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::Data Collection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateConcomitantMedicationDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Study Day Period) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)'"
   * @generated
   */
  boolean validateConcomitantMedicationStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C83232\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null).entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined(\'classCode\'))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C83218\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined(\'moodCode\'))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship)))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationconcomitantMedicationCategoryConcomitantMedicationSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationCategoryAssociationConcomitantMedicationCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C83085\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationConcomitantMedicationIndicationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::CAUS)'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationIndicationAssociationIndication(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C83232\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CE))))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateConcomitantMedicationconcomitantMedicationSubCategoryAssociationConcomitantMedicationSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(classCode=vocab::ActClassObservation::OBS)'"
   * @generated
   */
  boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
   * @generated
   */
  boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = code.oclAsType(datatypes::CD) in \nvalue.code = \'C83232\' and value.codeSystem = \'2.16.840.1.113883.3.26.1.1\'))'"
   * @generated
   */
  boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)'"
   * @generated
   */
  boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::ED))))'"
   * @generated
   */
  boolean validateConcomitantMedicationIntendedRegimenAssociationintendedRegimenValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::REFR)'"
   * @generated
   */
  boolean validateConcomitantMedicationIntendedRegimenAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))'"
   * @generated
   */
  boolean validateConcomitantMedicationIntendedRegimenAssociationIntendedRegimen(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Group Identifier))->asSequence()->any(true).oclAsType(sdtm::Group Identifier)'"
   * @generated
   */
  GroupIdentifier getGroupIdentifier();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Non Performance Reason))->asSequence()->any(true).oclAsType(sdtm::Non Performance Reason)'"
   * @generated
   */
  NonPerformanceReason getNonPerformanceReason();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Activity Start Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Activity Start Timing Reference)'"
   * @generated
   */
  ActivityStartTimingReference getActivityStartTimingReference();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Activity End Timing Reference))->asSequence()->any(true).oclAsType(sdtm::Activity End Timing Reference)'"
   * @generated
   */
  ActivityEndTimingReference getActivtyEndTimingReference();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Pre-Specified Event))->asSequence()->any(true).oclAsType(sdtm::Pre-Specified Event)'"
   * @generated
   */
  PreSpecifiedEvent getPreSpecifiedEvent();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->any(true).oclAsType(sdtm::Data Collection)'"
   * @generated
   */
  DataCollection getDataCollection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Study Day Period))->asSequence()->any(true).oclAsType(sdtm::Study Day Period)'"
   * @generated
   */
  StudyDayPeriod getStudyDayPeriod();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcomitantMedication init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConcomitantMedication init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ConcomitantMedication
