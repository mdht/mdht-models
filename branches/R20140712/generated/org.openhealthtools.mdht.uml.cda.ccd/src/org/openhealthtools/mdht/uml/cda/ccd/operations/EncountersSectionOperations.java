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
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionEncountersActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Encounters Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#getEncountersActivities() <em>Get Encounters Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncountersSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncountersSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersSectionTemplateId(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TEMPLATE_ID,
					CCDPlugin.INSTANCE.getString("EncountersSectionTemplateId"), new Object[] { encountersSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionCode(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionCode(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '46240-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionCode(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionCode(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersSectionCode(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_ENCOUNTERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_CODE,
					CCDPlugin.INSTANCE.getString("EncountersSectionCode"), new Object[] { encountersSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionTitle(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionTitle(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionTitle(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionTitle(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersSectionTitle(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TITLE,
					CCDPlugin.INSTANCE.getString("EncountersSectionTitle"), new Object[] { encountersSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionText(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionText(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionText(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionText(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersSectionText(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TEXT,
					CCDPlugin.INSTANCE.getString("EncountersSectionText"), new Object[] { encountersSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionEncountersActivity(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Encounters Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEncountersActivity(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(ccd::EncountersActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionEncountersActivity(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Encounters Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEncountersActivity(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersSectionEncountersActivity(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, CCDValidator.DIAGNOSTIC_SOURCE,
					CCDValidator.ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY,
					CCDPlugin.INSTANCE.getString("EncountersSectionEncountersActivity"),
					new Object[] { encountersSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncountersActivities(EncountersSection) <em>Get Encounters Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersActivities(EncountersSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTERS_ACTIVITIES__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(ccd::EncountersActivity)).oclAsType(ccd::EncountersActivity)";

	/**
	 * The cached OCL query for the '{@link #getEncountersActivities(EncountersSection) <em>Get Encounters Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersActivities(EncountersSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTERS_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<EncountersActivity> getEncountersActivities(EncountersSection encountersSection) {
		if (GET_ENCOUNTERS_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				CCDPackage.Literals.ENCOUNTERS_SECTION,
				CCDPackage.Literals.ENCOUNTERS_SECTION.getEAllOperations().get(60));
			try {
				GET_ENCOUNTERS_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_ENCOUNTERS_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTERS_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EncountersActivity> result = (Collection<EncountersActivity>) query.evaluate(encountersSection);
		return new BasicEList.UnmodifiableEList<EncountersActivity>(result.size(), result.toArray());
	}

} // EncountersSectionOperations
