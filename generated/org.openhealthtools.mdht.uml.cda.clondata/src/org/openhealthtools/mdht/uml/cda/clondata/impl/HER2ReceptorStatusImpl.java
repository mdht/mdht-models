/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.HER2ReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.operations.HER2ReceptorStatusOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.ResultObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HER2 Receptor Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HER2ReceptorStatusImpl extends ResultObservationImpl implements HER2ReceptorStatus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HER2ReceptorStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getHER2ReceptorStatus();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHER2ReceptorStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HER2ReceptorStatusOperations.validateHER2ReceptorStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHER2ReceptorStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HER2ReceptorStatusOperations.validateHER2ReceptorStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHER2ReceptorStatusInterpretationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HER2ReceptorStatusOperations.validateHER2ReceptorStatusInterpretationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHER2ReceptorStatusInterpretationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HER2ReceptorStatusOperations.validateHER2ReceptorStatusInterpretationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHER2ReceptorStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HER2ReceptorStatusOperations.validateHER2ReceptorStatusValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HER2ReceptorStatusOperations.validateResultObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HER2ReceptorStatus init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HER2ReceptorStatus init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HER2ReceptorStatusImpl
