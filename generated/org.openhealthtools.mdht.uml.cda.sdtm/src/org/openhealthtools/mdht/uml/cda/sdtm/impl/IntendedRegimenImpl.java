/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.IntendedRegimen;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.IntendedRegimenOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intended Regimen</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IntendedRegimenImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements IntendedRegimen {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntendedRegimenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.INTENDED_REGIMEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIntendedRegimenTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IntendedRegimenOperations.validateIntendedRegimenTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIntendedRegimenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IntendedRegimenOperations.validateIntendedRegimenClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIntendedRegimenMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IntendedRegimenOperations.validateIntendedRegimenMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIntendedRegimenCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IntendedRegimenOperations.validateIntendedRegimenCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIntendedRegimenCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IntendedRegimenOperations.validateIntendedRegimenCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIntendedRegimenValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IntendedRegimenOperations.validateIntendedRegimenValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntendedRegimen init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public IntendedRegimen init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //IntendedRegimenImpl
