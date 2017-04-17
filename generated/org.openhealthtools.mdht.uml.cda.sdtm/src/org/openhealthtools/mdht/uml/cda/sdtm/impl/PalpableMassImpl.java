/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.PalpableMassOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Palpable Mass</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PalpableMassImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PalpableMass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PalpableMassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.PALPABLE_MASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassTargetSiteCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassStudyFindingEvaluator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassStudyFindingEvaluator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassPlannedStudyDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassMassIdentification(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassMassIdentification(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePalpableMassSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PalpableMassOperations.validatePalpableMassSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return PalpableMassOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedStudyDay getPlannedStudyDay() {
		return PalpableMassOperations.getPlannedStudyDay(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return PalpableMassOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return PalpableMassOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return PalpableMassOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return PalpableMassOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return PalpableMassOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PalpableMass init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PalpableMass init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //PalpableMassImpl
