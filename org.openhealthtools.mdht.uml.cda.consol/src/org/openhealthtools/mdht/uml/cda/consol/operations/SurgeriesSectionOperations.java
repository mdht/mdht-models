/*******************************************************************************
 * Copyright (c) 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Surgeries Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#validateSurgeriesSectionExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#getExternalReference() <em>Get External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#getProcedureActivities() <em>Get Procedure Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#validateSurgeriesNarrativeSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Narrative Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurgeriesSectionOperations extends SurgeriesNarrativeSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurgeriesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgeriesSectionExternalReference(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionExternalReference(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ExternalReference))";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgeriesSectionExternalReference(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section External Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionExternalReference(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ExternalReference))
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSurgeriesSectionExternalReference(SurgeriesSection surgeriesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGERIES_SECTION);
			try {
				VALIDATE_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			surgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SURGERIES_SECTION__SURGERIES_SECTION_EXTERNAL_REFERENCE,
					ConsolPlugin.INSTANCE.getString("SurgeriesSectionExternalReference"),
					new Object[] { surgeriesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getExternalReference(SurgeriesSection) <em>Get External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference(SurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXTERNAL_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ExternalReference))->asSequence()->first().oclAsType(consol::ExternalReference)";

	/**
	 * The cached OCL query for the '{@link #getExternalReference(SurgeriesSection) <em>Get External Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference(SurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXTERNAL_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ExternalReference))->asSequence()->first().oclAsType(consol::ExternalReference)
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ExternalReference getExternalReference(SurgeriesSection surgeriesSection) {
		if (GET_EXTERNAL_REFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SURGERIES_SECTION,
				ConsolPackage.Literals.SURGERIES_SECTION.getEAllOperations().get(60));
			try {
				GET_EXTERNAL_REFERENCE__EOCL_QRY = helper.createQuery(GET_EXTERNAL_REFERENCE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXTERNAL_REFERENCE__EOCL_QRY);
		return (ExternalReference) query.evaluate(surgeriesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureActivities(SurgeriesSection) <em>Get Procedure Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivities(SurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ACTIVITIES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure)).oclAsType(consol::ProcedureActivityProcedure)";

	/**
	 * The cached OCL query for the '{@link #getProcedureActivities(SurgeriesSection) <em>Get Procedure Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivities(SurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure)).oclAsType(consol::ProcedureActivityProcedure)
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProcedureActivityProcedure> getProcedureActivities(SurgeriesSection surgeriesSection) {
		if (GET_PROCEDURE_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SURGERIES_SECTION,
				ConsolPackage.Literals.SURGERIES_SECTION.getEAllOperations().get(61));
			try {
				GET_PROCEDURE_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityProcedure> result = (Collection<ProcedureActivityProcedure>) query.evaluate(surgeriesSection);
		return new BasicEList.UnmodifiableEList<ProcedureActivityProcedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgeriesNarrativeSectionTemplateId(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Narrative Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesNarrativeSectionTemplateId(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGERIES_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.7.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgeriesNarrativeSectionTemplateId(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Narrative Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesNarrativeSectionTemplateId(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SURGERIES_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.7.1')
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSurgeriesNarrativeSectionTemplateId(SurgeriesSection surgeriesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SURGERIES_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGERIES_SECTION);
			try {
				VALIDATE_SURGERIES_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGERIES_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGERIES_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			surgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SURGERIES_SECTION__SURGERIES_NARRATIVE_SECTION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"SurgeriesNarrativeSectionTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(surgeriesSection, context) }),
					new Object[] { surgeriesSection }));
			}
			return false;
		}
		return true;
	}

} // SurgeriesSectionOperations
