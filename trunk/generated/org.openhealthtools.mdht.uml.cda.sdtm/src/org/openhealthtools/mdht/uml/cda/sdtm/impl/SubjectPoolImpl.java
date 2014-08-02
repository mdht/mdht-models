/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectPool;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubjectPoolOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubjectPoolImpl extends ActImpl implements SubjectPool {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectPoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.SUBJECT_POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectPoolTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectPoolOperations.validateSubjectPoolTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectPoolMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectPoolOperations.validateSubjectPoolMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectPoolCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectPoolOperations.validateSubjectPoolCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectPoolCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectPoolOperations.validateSubjectPoolCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectPoolId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectPoolOperations.validateSubjectPoolId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectPoolParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectPoolOperations.validateSubjectPoolParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectPoolPoolParticipantSubjectMemberClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectPoolOperations.validateSubjectPoolPoolParticipantSubjectMemberClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectPoolPoolParticipantSubjectMemberId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectPoolOperations.validateSubjectPoolPoolParticipantSubjectMemberId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectPoolPoolParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectPoolOperations.validateSubjectPoolPoolParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubjectPoolPoolParticipantParticipantRole(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubjectPoolOperations.validateSubjectPoolPoolParticipantParticipantRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectPool init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public SubjectPool init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //SubjectPoolImpl
