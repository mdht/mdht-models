/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.Toxicity;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ToxicityOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toxicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ToxicityImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements Toxicity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToxicityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.TOXICITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateToxicityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ToxicityOperations.validateToxicityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateToxicityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ToxicityOperations.validateToxicityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateToxicityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ToxicityOperations.validateToxicityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateToxicityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ToxicityOperations.validateToxicityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateToxicityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ToxicityOperations.validateToxicityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateToxicityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ToxicityOperations.validateToxicityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateToxicityValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ToxicityOperations.validateToxicityValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toxicity init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public Toxicity init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //ToxicityImpl
