/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonStudyTreatmentRelationshipOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Study Treatment Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NonStudyTreatmentRelationshipImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements NonStudyTreatmentRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonStudyTreatmentRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.NON_STUDY_TREATMENT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonStudyTreatmentRelationshipTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonStudyTreatmentRelationshipOperations.validateNonStudyTreatmentRelationshipTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonStudyTreatmentRelationshipClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonStudyTreatmentRelationshipOperations.validateNonStudyTreatmentRelationshipClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonStudyTreatmentRelationshipCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonStudyTreatmentRelationshipOperations.validateNonStudyTreatmentRelationshipCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonStudyTreatmentRelationshipCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonStudyTreatmentRelationshipOperations.validateNonStudyTreatmentRelationshipCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonStudyTreatmentRelationshipMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonStudyTreatmentRelationshipOperations.validateNonStudyTreatmentRelationshipMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateNonStudyTreatmentRelationshipValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonStudyTreatmentRelationshipOperations.validateNonStudyTreatmentRelationshipValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonStudyTreatmentRelationship init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public NonStudyTreatmentRelationship init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //NonStudyTreatmentRelationshipImpl
