/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.Encounter;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterEntryOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Encounter#validateHITSPEncounterAdmissionSourceValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Admission Source Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Encounter#validateHITSPEncounterTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Encounter#validateHITSPEncounterCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncounterOperations extends EncounterEntryOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPEncounterAdmissionSourceValueSet(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Admission Source Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPEncounterAdmissionSourceValueSet(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select( par : cda::Participant2 | par.typeCode = vocab::ParticipationType::ORG )->forAll( par : cda::Participant2 | par.participantRole->one(pr : cda::ParticipantRole | pr.code.codeSystem = '2.16.840.1.113883.3.88.12.80.33') )";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPEncounterAdmissionSourceValueSet(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Admission Source Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPEncounterAdmissionSourceValueSet(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HITSP_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounter The receiving '<em><b>Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHITSPEncounterAdmissionSourceValueSet(Encounter encounter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ENCOUNTER);
			try {
				VALIDATE_HITSP_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HITSP_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HITSP_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				encounter)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ENCOUNTER__HITSP_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET,
						HITSPPlugin.INSTANCE.getString("EncounterHITSPEncounterAdmissionSourceValueSet"),
						new Object[] { encounter }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPEncounterTemplateId(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPEncounterTemplateId(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.16')";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPEncounterTemplateId(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPEncounterTemplateId(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HITSP_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounter The receiving '<em><b>Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHITSPEncounterTemplateId(Encounter encounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HITSP_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ENCOUNTER);
			try {
				VALIDATE_HITSP_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HITSP_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HITSP_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(encounter)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ENCOUNTER__HITSP_ENCOUNTER_TEMPLATE_ID,
						HITSPPlugin.INSTANCE.getString("EncounterHITSPEncounterTemplateId"),
						new Object[] { encounter }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPEncounterCode(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPEncounterCode(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.12' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPEncounterCode(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPEncounterCode(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HITSP_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encounter The receiving '<em><b>Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHITSPEncounterCode(Encounter encounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HITSP_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.ENCOUNTER);
			try {
				VALIDATE_HITSP_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HITSP_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_HITSP_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			encounter)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.ENCOUNTER__HITSP_ENCOUNTER_CODE,
						HITSPPlugin.INSTANCE.getString("EncounterHITSPEncounterCode"), new Object[] { encounter }));
			}

			return false;
		}
		return true;
	}

} // EncounterOperations
