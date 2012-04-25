/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

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
import org.openhealthtools.mdht.uml.cda.ccd.operations.CoverageActivityOperations;
import org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.PayerEntry;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry#validateCoverageEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry#validateCoverageEntryPayerEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Entry Payer Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry#getPayerEntries() <em>Get Payer Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoverageEntryOperations extends CoverageActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageEntryTemplateId(CoverageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Entry Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageEntryTemplateId(CoverageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.17')";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageEntryTemplateId(CoverageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Entry Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageEntryTemplateId(CoverageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.17')
	 * @param coverageEntry The receiving '<em><b>Coverage Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCoverageEntryTemplateId(CoverageEntry coverageEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.COVERAGE_ENTRY);
			try {
				VALIDATE_COVERAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.COVERAGE_ENTRY__COVERAGE_ENTRY_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("CoverageEntryTemplateId"), new Object[] { coverageEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoverageEntryPayerEntry(CoverageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Entry Payer Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageEntryPayerEntry(CoverageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_ENTRY_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::PayerEntry) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateCoverageEntryPayerEntry(CoverageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Entry Payer Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoverageEntryPayerEntry(CoverageEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COVERAGE_ENTRY_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ihe::PayerEntry) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param coverageEntry The receiving '<em><b>Coverage Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCoverageEntryPayerEntry(CoverageEntry coverageEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_COVERAGE_ENTRY_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.COVERAGE_ENTRY);
			try {
				VALIDATE_COVERAGE_ENTRY_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_ENTRY_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_ENTRY_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			coverageEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.COVERAGE_ENTRY__COVERAGE_ENTRY_PAYER_ENTRY,
					IHEPlugin.INSTANCE.getString("CoverageEntryPayerEntry"), new Object[] { coverageEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPayerEntries(CoverageEntry) <em>Get Payer Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerEntries(CoverageEntry)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAYER_ENTRIES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::PayerEntry)).oclAsType(ihe::PayerEntry)";

	/**
	 * The cached OCL query for the '{@link #getPayerEntries(CoverageEntry) <em>Get Payer Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerEntries(CoverageEntry)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAYER_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::PayerEntry)).oclAsType(ihe::PayerEntry)
	 * @param coverageEntry The receiving '<em><b>Coverage Entry</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<PayerEntry> getPayerEntries(CoverageEntry coverageEntry) {
		if (GET_PAYER_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.COVERAGE_ENTRY, IHEPackage.Literals.COVERAGE_ENTRY.getEAllOperations().get(63));
			try {
				GET_PAYER_ENTRIES__EOCL_QRY = helper.createQuery(GET_PAYER_ENTRIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAYER_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PayerEntry> result = (Collection<PayerEntry>) query.evaluate(coverageEntry);
		return new BasicEList.UnmodifiableEList<PayerEntry>(result.size(), result.toArray());
	}

} // CoverageEntryOperations
