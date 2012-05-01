/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryCauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Cause Of Death Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryCauseOfDeathObservation#validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Cause Of Death Observation Cause Of Death Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryCauseOfDeathObservation#getCauseOfDeathObservations() <em>Get Cause Of Death Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryCauseOfDeathObservation#validateFamilyHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryCauseOfDeathObservationOperations extends FamilyHistoryObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryCauseOfDeathObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(FamilyHistoryCauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Cause Of Death Observation Cause Of Death Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(FamilyHistoryCauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::CauseOfDeathObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(FamilyHistoryCauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Cause Of Death Observation Cause Of Death Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(FamilyHistoryCauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::CauseOfDeathObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)
	 * @param familyHistoryCauseOfDeathObservation The receiving '<em><b>Family History Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryCauseOfDeathObservationCauseOfDeathObservation(
			FamilyHistoryCauseOfDeathObservation familyHistoryCauseOfDeathObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryCauseOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION__FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION_CAUSE_OF_DEATH_OBSERVATION,
					CCDPlugin.INSTANCE.getString("FamilyHistoryCauseOfDeathObservationCauseOfDeathObservation"),
					new Object[] { familyHistoryCauseOfDeathObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCauseOfDeathObservations(FamilyHistoryCauseOfDeathObservation) <em>Get Cause Of Death Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeathObservations(FamilyHistoryCauseOfDeathObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAUSE_OF_DEATH_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::CauseOfDeathObservation)).oclAsType(ccd::CauseOfDeathObservation)";

	/**
	 * The cached OCL query for the '{@link #getCauseOfDeathObservations(FamilyHistoryCauseOfDeathObservation) <em>Get Cause Of Death Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseOfDeathObservations(FamilyHistoryCauseOfDeathObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAUSE_OF_DEATH_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::CauseOfDeathObservation)).oclAsType(ccd::CauseOfDeathObservation)
	 * @param familyHistoryCauseOfDeathObservation The receiving '<em><b>Family History Cause Of Death Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<CauseOfDeathObservation> getCauseOfDeathObservations(
			FamilyHistoryCauseOfDeathObservation familyHistoryCauseOfDeathObservation) {
		if (GET_CAUSE_OF_DEATH_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CCDPackage.Literals.FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION,
				CCDPackage.Literals.FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION.getEAllOperations().get(68));
			try {
				GET_CAUSE_OF_DEATH_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CAUSE_OF_DEATH_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CAUSE_OF_DEATH_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CauseOfDeathObservation> result = (Collection<CauseOfDeathObservation>) query.evaluate(familyHistoryCauseOfDeathObservation);
		return new BasicEList.UnmodifiableEList<CauseOfDeathObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationTemplateId(FamilyHistoryCauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationTemplateId(FamilyHistoryCauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.42')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationTemplateId(FamilyHistoryCauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationTemplateId(FamilyHistoryCauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.42')
	 * @param familyHistoryCauseOfDeathObservation The receiving '<em><b>Family History Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryObservationTemplateId(
			FamilyHistoryCauseOfDeathObservation familyHistoryCauseOfDeathObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			familyHistoryCauseOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.FAMILY_HISTORY_CAUSE_OF_DEATH_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FamilyHistoryObservationTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									familyHistoryCauseOfDeathObservation, context) }),
					new Object[] { familyHistoryCauseOfDeathObservation }));
			}

			return false;
		}
		return true;
	}

} // FamilyHistoryCauseOfDeathObservationOperations
