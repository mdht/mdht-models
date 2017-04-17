/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.AssayQuantitationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assay Quantitation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AssayQuantitationImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements AssayQuantitation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssayQuantitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.ASSAY_QUANTITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssayQuantitationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssayQuantitationOperations.validateAssayQuantitationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssayQuantitationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssayQuantitationOperations.validateAssayQuantitationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssayQuantitationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssayQuantitationOperations.validateAssayQuantitationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssayQuantitationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssayQuantitationOperations.validateAssayQuantitationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssayQuantitationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssayQuantitationOperations.validateAssayQuantitationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAssayQuantitationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssayQuantitationOperations.validateAssayQuantitationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssayQuantitation init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public AssayQuantitation init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //AssayQuantitationImpl
