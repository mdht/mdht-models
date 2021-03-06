/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

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
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Procedures Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection#getMu2consolProcedureActivityProcedures()
 * <em>Get Mu2consol Procedure Activity Procedures</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection#validateProceduresSectionProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Procedures Section Procedure Activity Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProceduresSectionOperations
		extends org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSectionOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ProceduresSectionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not
	 * procedure.oclIsUndefined() and
	 * procedure.oclIsKindOf(mu2consol::ProcedureActivityProcedure
	 * )).oclAsType(mu2consol::ProcedureActivityProcedure)
	 *
	 * @param proceduresSection
	 *            The receiving '<em><b>Procedures Section</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<ProcedureActivityProcedure> getMu2consolProcedureActivityProcedures(
			ProceduresSection proceduresSection) {

		if (GET_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.PROCEDURES_SECTION,
					Mu2consolPackage.Literals.PROCEDURES_SECTION.getEAllOperations().get(74));
			try {
				GET_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY = helper
						.createQuery(GET_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityProcedure> result = (Collection<ProcedureActivityProcedure>) query
				.evaluate(proceduresSection);
		return new BasicEList.UnmodifiableEList<ProcedureActivityProcedure>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.7.1')
	 *
	 * @param proceduresSection
	 *            The receiving '<em><b>Procedures Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateProceduresSectionEntriesOptionalTemplateId(ProceduresSection proceduresSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(
						VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						Mu2consolPlugin.INSTANCE
								.getString("ProceduresSectionProceduresSectionEntriesOptionalTemplateId"),
						new Object[] { proceduresSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getMu2consolProcedureActivityProcedures(ProceduresSection)
	 * <em>Get Mu2consol Procedure Activity Procedures</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMu2consolProcedureActivityProcedures(ProceduresSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(mu2consol::ProcedureActivityProcedure)).oclAsType(mu2consol::ProcedureActivityProcedure)";

	/**
	 * The cached OCL query for the
	 * '{@link #getMu2consolProcedureActivityProcedures(ProceduresSection)
	 * <em>Get Mu2consol Procedure Activity Procedures</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMu2consolProcedureActivityProcedures(ProceduresSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY;

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Procedures Section Entries Optional Template Id</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.7.1')";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Procedures Section Entries Optional Template Id</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateProceduresSectionEntriesOptionalTemplateId(ProceduresSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the
	 * '{@link #validateProceduresSectionProcedureActivityProcedure(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Procedures Section Procedure Activity Procedure</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateProceduresSectionProcedureActivityProcedure(ProceduresSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(mu2consol::ProcedureActivityProcedure))";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateProceduresSectionProcedureActivityProcedure(ProceduresSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Procedures Section Procedure Activity Procedure</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateProceduresSectionProcedureActivityProcedure(ProceduresSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param proceduresSection
	 *            The receiving '<em><b>Procedures Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateProceduresSectionProcedureActivityProcedure(ProceduresSection proceduresSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.PROCEDURES_SECTION);
			try {
				VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV
						.set(helper.createInvariant(
								VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get()
				.createQuery(
						VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(proceduresSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.INFO, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.PROCEDURES_SECTION__PROCEDURES_SECTION_PROCEDURE_ACTIVITY_PROCEDURE,
						Mu2consolPlugin.INSTANCE
								.getString("ProceduresSectionProceduresSectionProcedureActivityProcedure"),
						new Object[] { proceduresSection }));
			}

			return false;
		}
		return true;
	}

} // ProceduresSectionOperations