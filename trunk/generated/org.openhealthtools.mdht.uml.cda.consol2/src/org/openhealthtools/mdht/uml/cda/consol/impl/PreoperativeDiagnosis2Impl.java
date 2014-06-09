/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2;

import org.openhealthtools.mdht.uml.cda.consol.operations.PreoperativeDiagnosis2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preoperative Diagnosis2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PreoperativeDiagnosis2Impl extends PreoperativeDiagnosisImpl implements PreoperativeDiagnosis2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreoperativeDiagnosis2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PREOPERATIVE_DIAGNOSIS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreoperativeDiagnosisCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreoperativeDiagnosis2Operations.validatePreoperativeDiagnosisCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreoperativeDiagnosisTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreoperativeDiagnosis2Operations.validatePreoperativeDiagnosisTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePreoperativeDiagnosisCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreoperativeDiagnosis2Operations.validatePreoperativeDiagnosisCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreoperativeDiagnosis2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreoperativeDiagnosis2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PreoperativeDiagnosis2Impl
