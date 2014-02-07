/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.GlasgowQualifierOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glasgow Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GlasgowQualifierImpl extends ObservationImpl implements GlasgowQualifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlasgowQualifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.GLASGOW_QUALIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowQualifierTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowQualifierOperations.validateGlasgowQualifierTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowQualifierMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowQualifierOperations.validateGlasgowQualifierMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowQualifierCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowQualifierOperations.validateGlasgowQualifierCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowQualifierCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowQualifierOperations.validateGlasgowQualifierCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowQualifierValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowQualifierOperations.validateGlasgowQualifierValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowQualifierValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowQualifierOperations.validateGlasgowQualifierValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowQualifier init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowQualifier init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // GlasgowQualifierImpl
