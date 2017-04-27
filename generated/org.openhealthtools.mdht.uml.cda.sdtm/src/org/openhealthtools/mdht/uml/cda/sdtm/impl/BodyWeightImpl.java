/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.BodyWeightOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Weight</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BodyWeightImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements BodyWeight {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyWeightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.BODY_WEIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightInterpretationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightNonPerformanceReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightExclusionReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightExclusionReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateBodyWeightFastingStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyWeightOperations.validateBodyWeightFastingStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason getNonPerformanceReason() {
		return BodyWeightOperations.getNonPerformanceReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return BodyWeightOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusionReason getExclusionReason() {
		return BodyWeightOperations.getExclusionReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return BodyWeightOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return BodyWeightOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return BodyWeightOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return BodyWeightOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FastingStatus getFastingStatus() {
		return BodyWeightOperations.getFastingStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyWeight init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public BodyWeight init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //BodyWeightImpl
