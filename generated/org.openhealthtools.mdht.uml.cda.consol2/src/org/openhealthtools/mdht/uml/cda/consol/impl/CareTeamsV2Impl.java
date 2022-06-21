/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizerV2;
import org.openhealthtools.mdht.uml.cda.consol.CareTeamsV2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamsV2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Teams V2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CareTeamsV2Impl extends SectionImpl implements CareTeamsV2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareTeamsV2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CARE_TEAMS_V2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamsV2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamsV2Operations.validateCareTeamsV2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamsV2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamsV2Operations.validateCareTeamsV2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamsV2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamsV2Operations.validateCareTeamsV2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamsV2Title(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamsV2Operations.validateCareTeamsV2Title(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamsV2Text(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamsV2Operations.validateCareTeamsV2Text(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamsV2CareTeamOrganizerV2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamsV2Operations.validateCareTeamsV2CareTeamOrganizerV2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CareTeamOrganizerV2> getCareTeamOrganizerV2s() {
		return CareTeamsV2Operations.getCareTeamOrganizerV2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamsV2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeamsV2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CareTeamsV2Impl
