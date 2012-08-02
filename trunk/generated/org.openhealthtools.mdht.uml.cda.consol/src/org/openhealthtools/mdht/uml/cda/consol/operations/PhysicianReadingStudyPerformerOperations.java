/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physician Reading Study Performer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicianReadingStudyPerformerOperations extends ParticipationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicianReadingStudyPerformerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerTemplateId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTemplateId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerTemplateId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTemplateId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.1')
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicianReadingStudyPerformerTemplateId(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicianReadingStudyPerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PhysicianReadingStudyPerformerTemplateId"),
					new Object[] { physicianReadingStudyPerformer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerTime(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTime(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerTime(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTime(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicianReadingStudyPerformerTime(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicianReadingStudyPerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_TIME,
					ConsolPlugin.INSTANCE.getString("PhysicianReadingStudyPerformerTime"),
					new Object[] { physicianReadingStudyPerformer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerTypeCode(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTypeCode(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('typeCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerTypeCode(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTypeCode(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('typeCode')
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicianReadingStudyPerformerTypeCode(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicianReadingStudyPerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("PhysicianReadingStudyPerformerTypeCode"),
					new Object[] { physicianReadingStudyPerformer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntity(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntity(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntity(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntity(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicianReadingStudyPerformerAssignedEntity(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicianReadingStudyPerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY,
					ConsolPlugin.INSTANCE.getString("PhysicianReadingStudyPerformerAssignedEntity"),
					new Object[] { physicianReadingStudyPerformer }));
			}

			return false;
		}
		return true;
	}

} // PhysicianReadingStudyPerformerOperations
