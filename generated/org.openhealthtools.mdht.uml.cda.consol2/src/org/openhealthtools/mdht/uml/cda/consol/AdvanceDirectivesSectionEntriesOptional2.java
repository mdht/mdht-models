/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advance Directives Section Entries Optional2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdvanceDirectivesSectionEntriesOptional2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AdvanceDirectivesSectionEntriesOptionalTemplateId AdvanceDirectivesSectionEntriesOptionalCode AdvanceDirectivesSectionEntriesOptionalCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.21' templateId.extension='2014-06-09' code.code='42348-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Advance Directives' constraints.validation.dependOn.AdvanceDirectivesSectionEntriesOptionalCode='AdvanceDirectivesSectionEntriesOptionalCodeP' constraints.validation.info='AdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer AdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation'"
 * @generated
 */
public interface AdvanceDirectivesSectionEntriesOptional2 extends AdvanceDirectivesSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::AdvanceDirectiveOrganizer))'"
	 * @generated
	 */
	boolean validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::AdvanceDirectiveOrganizer)).oclAsType(consol::AdvanceDirectiveOrganizer)'"
	 * @generated
	 */
	EList<AdvanceDirectiveOrganizer> getAdvanceDirectiveOrganizers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveObservation2)).oclAsType(consol::AdvanceDirectiveObservation2)'"
	 * @generated
	 */
	EList<AdvanceDirectiveObservation2> getConsolAdvanceDirectiveObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectivesSectionEntriesOptional2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectivesSectionEntriesOptional2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdvanceDirectivesSectionEntriesOptional2
