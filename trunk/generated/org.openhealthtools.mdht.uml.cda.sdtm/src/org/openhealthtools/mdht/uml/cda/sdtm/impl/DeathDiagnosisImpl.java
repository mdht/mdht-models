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

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.DeathDiagnosisOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Death Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeathDiagnosisImpl extends ObservationImpl implements DeathDiagnosis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeathDiagnosisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.DEATH_DIAGNOSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisStudyFindingEvaluator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisStudyFindingEvaluator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisDataCollection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisDomainAssignment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisDomainAssignment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisRelatedRecord(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisRelatedRecord(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisSupplementalValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisSupplementalValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathDiagnosisResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathDiagnosisOperations.validateDeathDiagnosisResultCategory(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection getDataCollection() {
		return DeathDiagnosisOperations.getDataCollection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		return DeathDiagnosisOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment getDomainAssignment() {
		return DeathDiagnosisOperations.getDomainAssignment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedRecord> getRelatedRecords() {
		return DeathDiagnosisOperations.getRelatedRecords(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplementalValue> getSupplementalValues() {
		return DeathDiagnosisOperations.getSupplementalValues(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultCategory getResultCategory() {
		return DeathDiagnosisOperations.getResultCategory(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathDiagnosis init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public DeathDiagnosis init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //DeathDiagnosisImpl
