/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer_AssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianReadingStudyPerformer_AssignedEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physician Reading Study Performer Assigned Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhysicianReadingStudyPerformer_AssignedEntityImpl extends AssignedEntityImpl implements
		PhysicianReadingStudyPerformer_AssignedEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicianReadingStudyPerformer_AssignedEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicianReadingStudyPerformer_AssignedEntityOperations.validateAssignedEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicianReadingStudyPerformer_AssignedEntityOperations.validateAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianReadingStudyPerformer_AssignedEntity init() {
    	CDAUtil.init(this);
    	return this;
	}
} // PhysicianReadingStudyPerformer_AssignedEntityImpl
