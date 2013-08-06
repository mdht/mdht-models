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
import org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfProceduresOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.HistoryOfProceduresOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Of Procedures Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HistoryOfProceduresOrganizerImpl extends OrganizerImpl implements HistoryOfProceduresOrganizer {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected HistoryOfProceduresOrganizerImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.HISTORY_OF_PROCEDURES_ORGANIZER;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryOfProceduresOrganizerOperations.validateHistoryOfProceduresOrganizerExistenceOfHistoryOfProcedureComponent(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHistoryOfProceduresOrganizerHistoryOfProceduresComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryOfProceduresOrganizerOperations.validateHistoryOfProceduresOrganizerHistoryOfProceduresComponent(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateHistoryOfProceduresOrganizerTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryOfProceduresOrganizerOperations.validateHistoryOfProceduresOrganizerTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public HistoryOfProceduresOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfProceduresOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HistoryOfProceduresOrganizerImpl
