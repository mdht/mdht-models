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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.operations.Indication2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indication2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Indication2Impl extends IndicationImpl implements Indication2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Indication2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INDICATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndicationProblemIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Indication2Operations.validateIndicationProblemIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndicationCodeNullFlavorValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Indication2Operations.validateIndicationCodeNullFlavorValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndication2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Indication2Operations.validateIndication2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationCodeNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Indication2Operations.validateIndicationCodeNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Indication2Operations.validateIndicationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Indication2Operations.validateIndicationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Indication2Operations.validateIndicationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Indication2Operations.validateIndicationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateIndicationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Indication2Operations.validateIndicationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Indication2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Indication2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // Indication2Impl
