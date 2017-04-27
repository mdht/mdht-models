/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.FoodandWaterConsumptionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foodand Water Consumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FoodandWaterConsumptionImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements FoodandWaterConsumption {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FoodandWaterConsumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionStudyDayPeriod(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionExclusionReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionExclusionReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionGroupIdentifier(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFoodandWaterConsumptionSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return FoodandWaterConsumptionOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod getStudyDayPeriod() {
		return FoodandWaterConsumptionOperations.getStudyDayPeriod(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusionReason getExclusionReason() {
		return FoodandWaterConsumptionOperations.getExclusionReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier getGroupIdentifier() {
		return FoodandWaterConsumptionOperations.getGroupIdentifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return FoodandWaterConsumptionOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return FoodandWaterConsumptionOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return FoodandWaterConsumptionOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return FoodandWaterConsumptionOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FoodandWaterConsumption init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public FoodandWaterConsumption init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //FoodandWaterConsumptionImpl
