/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatus2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemStatus2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Status2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProblemStatus2Impl extends ProblemStatusImpl implements ProblemStatus2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemStatus2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROBLEM_STATUS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatus2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatus2Operations.validateProblemStatus2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemStatusTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatus2Operations.validateProblemStatusTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemStatusReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatus2Operations.validateProblemStatusReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemStatusTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatus2Operations.validateProblemStatusTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemStatusText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatus2Operations.validateProblemStatusText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemStatus2Operations.validateProblemStatusValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemStatus2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemStatus2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProblemStatus2Impl
