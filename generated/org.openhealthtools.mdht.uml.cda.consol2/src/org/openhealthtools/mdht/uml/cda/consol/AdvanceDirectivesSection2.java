/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advance Directives Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdvanceDirectivesSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AdvanceDirectivesSectionEntriesOptionalTemplateId AdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer AdvanceDirectivesSectionEntriesOptionalCode AdvanceDirectivesSectionEntriesOptionalCodeP AdvanceDirectivesSection2Title AdvanceDirectivesSection2Text AdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer AdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation AdvanceDirectivesSection2Entry' templateId.root='2.16.840.1.113883.10.20.22.2.21.1' templateId.extension='2015-08-01' constraints.validation.dependOn.AdvanceDirectivesSectionEntriesOptionalCode='AdvanceDirectivesSectionEntriesOptionalCodeP' nullFlavor='NI' constraints.validation.info='AdvanceDirectivesSection2NullFlavor AdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer AdvanceDirectivesSection2EntryAdvanceDirectiveObservation2' constraints.validation.query='AdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer AdvanceDirectivesSection2EntryAdvanceDirectiveObservation2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectivesSection2Entry constraints.validation.info='AdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer AdvanceDirectivesSection2EntryAdvanceDirectiveObservation2'"
 * @generated
 */
public interface AdvanceDirectivesSection2 extends AdvanceDirectivesSectionEntriesOptional2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies self.getObservations()-&gt;exists(obs : cda::Observation | obs.oclIsKindOf(consol::AdvanceDirectiveObservation2)) xor self.getOrganizers()-&gt;exists(org : cda::Organizer | org.oclIsKindOf(consol::AdvanceDirectiveOrganizer))'"
	 * @generated
	 */
	boolean validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAdvanceDirectivesSection2Title(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateAdvanceDirectivesSection2Text(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'nullFlavor\')'"
	 * @generated
	 */
	boolean validateAdvanceDirectivesSection2NullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateAdvanceDirectivesSection2Entry(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry-&gt;excluding(null)-&gt;reject(organizer-&gt;one(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::AdvanceDirectiveOrganizer)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry-&gt;excluding(null)-&gt;reject(observation-&gt;one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveObservation2)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()-&gt;select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::AdvanceDirectiveOrganizer)).oclAsType(consol::AdvanceDirectiveOrganizer)'"
	 * @generated
	 */
	EList<AdvanceDirectiveOrganizer> getConsolAdvanceDirectiveOrganizers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdvanceDirectivesSection2
