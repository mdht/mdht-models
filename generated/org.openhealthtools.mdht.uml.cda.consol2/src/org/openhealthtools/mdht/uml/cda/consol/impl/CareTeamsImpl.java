/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.consol.CareTeamOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.CareTeams;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.CareTeamsOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Teams</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CareTeamsImpl extends SectionImpl implements CareTeams {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CareTeamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CARE_TEAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamsOperations.validateCareTeamsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamsOperations.validateCareTeamsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamsOperations.validateCareTeamsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamsTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamsOperations.validateCareTeamsTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamsText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamsOperations.validateCareTeamsText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCareTeamsCareTeamOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CareTeamsOperations.validateCareTeamsCareTeamOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CareTeamOrganizer> getCareTeamOrganizers() {
		return CareTeamsOperations.getCareTeamOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeams init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareTeams init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CareTeamsImpl
