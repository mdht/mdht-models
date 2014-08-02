/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.Indication;
import org.openhealthtools.mdht.uml.cda.sdtm.IntendedRegimen;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.ConcomitantMedicationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concomitant Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConcomitantMedicationImpl extends SubstanceAdministrationImpl implements ConcomitantMedication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcomitantMedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.CONCOMITANT_MEDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationMaxDoseQuantity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationRouteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationRouteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationConsumableMaterial(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationConsumableMaterial(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationPreSpecifiedEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationPreSpecifiedEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationStudyDayPeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationTimingReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationStartRelativetoReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationStartRelativetoReferencePeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationStopRelativetoReferencePeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationStopRelativetoReferencePeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationIntendedRegimen(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationIntendedRegimen(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationSubCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationFindingAbout(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationFindingAbout(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationEventDuration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationEventDuration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConcomitantMedicationOperations.validateConcomitantMedicationHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return ConcomitantMedicationOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return ConcomitantMedicationOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreSpecifiedEvent getPreSpecifiedEvent() {
		return ConcomitantMedicationOperations.getPreSpecifiedEvent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return ConcomitantMedicationOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod getStudyDayPeriod() {
		return ConcomitantMedicationOperations.getStudyDayPeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference getTimingReference() {
		return ConcomitantMedicationOperations.getTimingReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return ConcomitantMedicationOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return ConcomitantMedicationOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return ConcomitantMedicationOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return ConcomitantMedicationOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartRelativetoReferencePeriod getStartRelativetoReferencePeriod() {
		return ConcomitantMedicationOperations.getStartRelativetoReferencePeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopRelativetoReferencePeriod getStopRelativetoReferencePeriod() {
		return ConcomitantMedicationOperations.getStopRelativetoReferencePeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Indication getIndication() {
		return ConcomitantMedicationOperations.getIndication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntendedRegimen getIntendedRegimen() {
		return ConcomitantMedicationOperations.getIntendedRegimen(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return ConcomitantMedicationOperations.getCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory getSubCategory() {
		return ConcomitantMedicationOperations.getSubCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FindingAbout> getFindingAbouts() {
		return ConcomitantMedicationOperations.getFindingAbouts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDuration getEventDuration() {
		return ConcomitantMedicationOperations.getEventDuration(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcomitantMedication init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public ConcomitantMedication init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //ConcomitantMedicationImpl
