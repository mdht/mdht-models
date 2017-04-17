/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyTestOrganizationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Test Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StudyTestOrganizationImpl extends org.eclipse.mdht.uml.cda.impl.Participant2Impl implements StudyTestOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyTestOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.STUDY_TEST_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTestOrganizationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTestOrganizationOperations.validateStudyTestOrganizationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTestOrganizationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTestOrganizationOperations.validateStudyTestOrganizationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStudyTestOrganizationRoleOfPerformer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyTestOrganizationOperations.validateStudyTestOrganizationRoleOfPerformer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyTestOrganization init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public StudyTestOrganization init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //StudyTestOrganizationImpl
