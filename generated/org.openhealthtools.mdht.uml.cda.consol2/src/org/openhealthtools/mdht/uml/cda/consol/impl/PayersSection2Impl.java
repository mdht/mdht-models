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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PayersSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payers Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PayersSection2Impl extends PayersSectionImpl implements PayersSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayersSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PAYERS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayersSection2Operations.validatePayersSection2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoverageActivity2> getConsolCoverageActivity2s() {
		return PayersSection2Operations.getConsolCoverageActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePayersSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayersSection2Operations.validatePayersSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePayersSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayersSection2Operations.validatePayersSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePayersSectionCoverageActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PayersSection2Operations.validatePayersSectionCoverageActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayersSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayersSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PayersSection2Impl
