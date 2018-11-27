//
//  Generated from FHIR Version 3.0.1.11917 on 2018-11-27T12:50:39.899 
//
//   2018, JuiceLab, LLC
//  
package com.juicelabs.fhir.model

import kotlin.collections.List

/**
 * Information about a biological sequence
 *
 * Raw data describing a biological sequence.
 */
open class Sequence() : DomainResource() {
    val identifier: List<Identifier> = mutableListOf<Identifier>()

    /**
     * aa | dna | rna
     */
    var type: String? = null

    /**
     * Base number of coordinate system (0 for 0-based numbering or coordinates, inclusive start, exclusive end, 1 for 1-based numbering, inclusive start, inclusive end)
     */
    var coordinateSystem: Int = 0

    /**
     * Who and/or what this is about
     */
    var patient: Reference? = null

    /**
     * Specimen used for sequencing
     */
    var specimen: Reference? = null

    /**
     * The method for sequencing
     */
    var device: Reference? = null

    /**
     * Who should be responsible for test result
     */
    var performer: Reference? = null

    /**
     * The number of copies of the seqeunce of interest.  (RNASeq)
     */
    var quantity: Quantity? = null

    /**
     * A sequence used as reference
     */
    var referenceSeq: SequenceReferenceSeq? = null

    val variant: List<SequenceVariant> = mutableListOf<SequenceVariant>()

    /**
     * Sequence that was observed
     */
    var observedSeq: String? = null

    val quality: List<SequenceQuality> = mutableListOf<SequenceQuality>()

    /**
     * Average number of reads representing a given nucleotide in the reconstructed sequence
     */
    var readCoverage: Int? = null

    val repository: List<SequenceRepository> = mutableListOf<SequenceRepository>()

    val pointer: List<Reference> = mutableListOf<Reference>()
}

/**
 * A sequence used as reference
 *
 * A sequence that is used as a reference to describe variants that are present in a sequence analyzed.
 */
open class SequenceReferenceSeq() : BackboneElement() {
    /**
     * Chromosome containing genetic finding
     */
    var chromosome: CodeableConcept? = null

    /**
     * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'
     */
    var genomeBuild: String? = null

    /**
     * Reference identifier
     */
    var referenceSeqId: CodeableConcept? = null

    /**
     * A Pointer to another Sequence entity as reference sequence
     */
    var referenceSeqPointer: Reference? = null

    /**
     * A string to represent reference sequence
     */
    var referenceSeqString: String? = null

    /**
     * Directionality of DNA ( +1/-1)
     */
    var strand: Int? = null

    /**
     * Start position of the window on the  reference sequence
     */
    var windowStart: Int = 0

    /**
     * End position of the window on the reference sequence
     */
    var windowEnd: Int = 0
}

/**
 * Variant in sequence
 *
 * The definition of variant here originates from Sequence ontology ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can represent some complex mutation or segment variation with the assist of CIGAR string.
 */
open class SequenceVariant() : BackboneElement() {
    /**
     * Start position of the variant on the  reference sequence
     */
    var start: Int? = null

    /**
     * End position of the variant on the reference sequence
     */
    var end: Int? = null

    /**
     * Allele that was observed
     */
    var observedAllele: String? = null

    /**
     * Allele in the reference sequence
     */
    var referenceAllele: String? = null

    /**
     * Extended CIGAR string for aligning the sequence with reference bases
     */
    var cigar: String? = null

    /**
     * Pointer to observed variant information
     */
    var variantPointer: Reference? = null
}

/**
 * An set of value as quality of sequence
 *
 * An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
 */
open class SequenceQuality() : BackboneElement() {
    /**
     * indel | snp | unknown
     */
    var type: String = ""

    /**
     * Standard sequence for comparison
     */
    var standardSequence: CodeableConcept? = null

    /**
     * Start position of the sequence
     */
    var start: Int? = null

    /**
     * End position of the sequence
     */
    var end: Int? = null

    /**
     * Quality score for the comparison
     */
    var score: Quantity? = null

    /**
     * Method to get quality
     */
    var method: CodeableConcept? = null

    /**
     * True positives from the perspective of the truth data
     */
    var truthTP: Float? = null

    /**
     * True positives from the perspective of the query data
     */
    var queryTP: Float? = null

    /**
     * False negatives
     */
    var truthFN: Float? = null

    /**
     * False positives
     */
    var queryFP: Float? = null

    /**
     * False positives where the non-REF alleles in the Truth and Query Call Sets match
     */
    var gtFP: Float? = null

    /**
     * Precision of comparison
     */
    var precision: Float? = null

    /**
     * Recall of comparison
     */
    var recall: Float? = null

    /**
     * F-score
     */
    var fScore: Float? = null
}

/**
 * External repository which contains detailed report related with observedSeq in this resource
 *
 * Configurations of the external repository. The repository shall store target's observedSeq or records related with target's observedSeq.
 */
open class SequenceRepository() : BackboneElement() {
    /**
     * directlink | openapi | login | oauth | other
     */
    var type: String = ""

    /**
     * URI of the repository
     */
    var url: String? = null

    /**
     * Repository's name
     */
    var name: String? = null

    /**
     * Id of the dataset that used to call for dataset in repository
     */
    var datasetId: String? = null

    /**
     * Id of the variantset that used to call for variantset in repository
     */
    var variantsetId: String? = null

    /**
     * Id of the read
     */
    var readsetId: String? = null
}
